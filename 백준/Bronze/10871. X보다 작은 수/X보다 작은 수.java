import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String firstStr = bufferedReader.readLine() + "\n";
        final Index index = new Index();
        index.setIndex(0);

        final int X = readInt(firstStr, index);
        final int N = readInt(firstStr, index);

        final String secondStr = bufferedReader.readLine() + "\n";
        final StringBuilder sb = new StringBuilder();
        index.setIndex(0);

        while (secondStr.charAt(index.getIndex()) != '\n') {
            final int in = readInt(secondStr, index);
            if (in < N) {
                sb.append(in + " ");
            }
        }

        System.out.print(sb.toString());
        bufferedReader.close();
    }

    private static int readInt(String str, Index index) {
        int val = 0;
        int inx = index.getIndex();
        do {
            val = val * 10;
            val += str.charAt(inx++) - '0';
        } while (str.charAt(inx) != '\n' && str.charAt(inx) != ' ');
        index.setIndex(inx == str.length() -1 ? inx : inx + 1);
        return val;
    }

    static class Index {
        private int index;

        public int getIndex() {
            return index;
        }

        public void setIndex(final int index) {
            this.index = index;
        }
    }

}