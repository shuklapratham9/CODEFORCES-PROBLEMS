import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(sb(s));
        }
        sc.close();
    }

    public static String sb(String s) {
        if (s.length() <= 10) {
            return s;
        }
        String f = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
        return f;
    }
}
