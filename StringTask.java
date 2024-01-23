import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String f = "";
        for (int i = 0; i < s.length(); i++) {
            if (!isvowel(s.charAt(i))) {
                f = f + "." + getc(s.charAt(i));
            }
        }
        System.out.println(f);
        sc.close();
    }

    public static boolean isvowel(char c) {
        if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
                || c == 'u' || c == 'Y' || c == 'y') {
            return true;
        }
        return false;
    }

    public static char getc(char c) {
        if ((int) c >= 65 && (int) c <= 90) {
            return (char) ((int) c + 32);
        }
        return c;
    }
}
