import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, List<Integer>> albumMap = new HashMap<>();
        Map<String, Integer> sumPlaysGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            if (!albumMap.containsKey(genres[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(plays[i]);
                albumMap.put(genres[i], list);

                sumPlaysGenre.put(genres[i], plays[i]);
                continue;
            }
            albumMap.get(genres[i]).add(plays[i]);
            sumPlaysGenre.put(genres[i], sumPlaysGenre.get(genres[i]) + plays[i]);
        }

        List<String> orderGenre = new ArrayList<>(albumMap.keySet());

        orderGenre.sort(((o1, o2) -> sumPlaysGenre.get(o2).compareTo(sumPlaysGenre.get(o1))));
        List<Integer> bestAlbumPlays = new ArrayList<>();
        int inx = 0;

        for (String genre : orderGenre) {
            final List<Integer> musicPlays = albumMap.get(genre);
            musicPlays.sort(((o1, o2) -> o2 - o1));
            bestAlbumPlays.add(
                    IntStream.range(0, plays.length)
                    .filter(i -> genres[i].equals(genre) && musicPlays.get(0) == plays[i])
                    .findFirst()
                    .orElse(-1)
            );
            inx++;

            if (musicPlays.size() == 1) {
                continue;
            }

            if (musicPlays.get(0).equals(musicPlays.get(1))) {
                bestAlbumPlays.add(
                        IntStream.range(bestAlbumPlays.get(inx-1) + 1, plays.length)
                        .filter(i -> genres[i].equals(genre) && musicPlays.get(1) == plays[i])
                        .findFirst()
                        .orElse(-1)
                );
                inx++;
                continue;
            }

            bestAlbumPlays.add(
                    IntStream.range(0, plays.length)
                    .filter(i -> genres[i].equals(genre) && musicPlays.get(1) == plays[i])
                    .findFirst()
                    .orElse(-1)
            );
            inx++;
        }

        return bestAlbumPlays.stream().mapToInt(i -> i).toArray();
    }
}