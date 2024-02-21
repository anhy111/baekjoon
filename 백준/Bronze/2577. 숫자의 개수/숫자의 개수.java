import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final int a = readInt();
        final int b = readInt();
        final int c = readInt();
        
        int sum = a * b * c;
        final String str = String.valueOf(sum);
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i + '0') {
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }

        System.out.println(sb);
    }
    
    private static int readInt() throws IOException {
        int total = 0;
        int val = 0;

        while ((val = System.in.read()) != '\n' && val != ' ') {
            if (val == '-') {
                val = System.in.read();
                total = -(val - '0');
                continue;
            }
            total = total * 10 + (val - '0');
        }
        return total;
    }
}