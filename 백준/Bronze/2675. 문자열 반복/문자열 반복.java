import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int count = readInt();

        final StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < count; i++) {
            final int repeatCnt = readInt();
            int op;

            while ((op = System.in.read()) != '\n' && op != ' ') {
                for (int j = 0; j < repeatCnt; j++) {
                    sb.append((char)op);
                }
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }

    private static int readInt() throws IOException {
        int val = 0;
        int total = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            total = total * 10 + (val - '0');
        }
        return total;
    }
}

