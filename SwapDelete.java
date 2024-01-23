import java.util.Scanner;

public class SwapDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(sd(s));
        }
        sc.close();
    }

    public static int sd(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int f[] = new int[2];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - '0']++;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == 1) {
                j = 0;
            } else {
                j = 1;
            }
            if (f[j] == 0) {
                return s.length() - i;
            }
            f[j]--;
        }
        return 0;

    }
}
