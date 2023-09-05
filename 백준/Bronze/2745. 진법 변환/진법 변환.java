import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final char[] chars = readChars();
        final int base = readInt();

        int sum = 0;
        for (int i = 0; i< chars.length; i++) {
            sum *= base;
            int op = chars[i];
            if (op <= '9') {
                sum += op - '0';
            } else if (op <= 'Z'){
                sum += op - 'A' + 10;
            }
        }


        System.out.println(sum);
    }

    private static char[] readChars() throws IOException {
        final char[] chars = new char[35];
        int inx = 0;
        int val = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            chars[inx++] = (char) val;
        }

        final char[] rtnChars = new char[inx];
        for (int i = 0; i < rtnChars.length; i++) {
            rtnChars[i] = chars[i];
        }
        return rtnChars;
    }

    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;
        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}