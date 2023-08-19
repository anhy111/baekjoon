import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final int[] alphabet = new int[27];
        int val;

        while ((val = System.in.read()) != '\n') {
            if ('Z' < val) {
                val -= 32;
            }

            alphabet[val - 'A' + 1]++;
        }


        int maxInx = 0;
        int max = 0;
        boolean duplication = false;
        for (int i = 1; i < alphabet.length; i++) {
            if (max == alphabet[i]) {
                duplication = true;
            }

            if (max < alphabet[i]) {
                max = alphabet[i];
                maxInx = i;
                duplication = false;
            }

        }
        if (duplication) {
            System.out.println('?');
        } else {
            System.out.println((char)('A' - 1 + maxInx));
        }
    }
}