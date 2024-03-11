import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for (String s : quiz) {
            final String[] split = s.split(" ");
            final int split0 = Integer.parseInt(split[0]);
            final int split2 = Integer.parseInt(split[2]);
            final int split4 = Integer.parseInt(split[4]);
            if (split[1].equals("+") && split0 + split2 == split4
            || split[1].equals("-") && split0 - split2 == split4) {
                list.add("O");
            } else {
                list.add("X");
            }
        }
        return list.toArray(new String[list.size()]);
    }
}