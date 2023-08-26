import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {

    private static final int MAX_INPUT_LENGTH = 20;
    private static final Map<String, Double> gradeScore = new HashMap<>();

    static {
        gradeScore.put("A+", 4.5);
        gradeScore.put("A0", 4.0);
        gradeScore.put("B+", 3.5);
        gradeScore.put("B0", 3.0);
        gradeScore.put("C+", 2.5);
        gradeScore.put("C0", 2.0);
        gradeScore.put("D+", 1.5);
        gradeScore.put("D0", 1.0);
        gradeScore.put("F", 0.0);
    }

    public static void main(String[] args) throws IOException {

        double totalCredit = 0.0;
        double totalRating = 0.0;

        for (int i = 0; i < MAX_INPUT_LENGTH; i++) {
            final String subject = readCharArr(100);
            final String creditChars = readCharArr(3);
            final double credit = Double.parseDouble(creditChars);
            final String gradeChars = readCharArr(2);
            if (gradeChars.charAt(0) == 'P') {
                continue;
            } else if (gradeChars.charAt(0) == 'F') {
                totalCredit += credit;
                continue;
            }

            final double grade = gradeScore.get(gradeChars);
            totalRating += credit * grade;
            totalCredit += credit;
        }

        if (totalCredit == 0) {
            System.out.println("0.000000");
        } else {
            System.out.printf("%.6f",totalRating / totalCredit);
        }
    }

    private static String readCharArr(final int maxCapacity) throws IOException {
        int val;
        final char[] arr = new char[maxCapacity];
        int i = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            arr[i++] = (char)val;
        }
        return String.valueOf(arr);
    }
}