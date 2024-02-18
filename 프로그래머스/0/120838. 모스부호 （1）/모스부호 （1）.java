import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String letter) {
        Map<String, String> map = new HashMap<>(26){
            {
                put(".-", "a"); put("-...", "b"); put("-.-.", "c"); put("-..", "d"); put(".", "e"); put("..-.", "f"); put("--.", "g"); put("....", "h");
                put("..", "i"); put(".---", "j"); put("-.-", "k"); put(".-..", "l"); put("--", "m"); put("-.", "n"); put("---", "o"); put(".--.", "p");
                put("--.-", "q"); put(".-.", "r"); put("...", "s"); put("-", "t"); put("..-", "u"); put("...-", "v"); put(".--", "w"); put("-..-", "x");
                put("-.--", "y"); put("--..", "z");
            }
        };

        final String[] split = letter.split(" ");
        final StringBuilder sb = new StringBuilder();

        for (String mos : split) {
            sb.append(map.get(mos));
        }

        return sb.toString();
    }
}