import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] a = new byte[3];
        final int read = System.in.read(a);
        System.out.println(a[0] - a[2]);
    }
}