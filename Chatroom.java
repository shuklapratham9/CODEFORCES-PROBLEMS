import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s));
        sc.close();
    }

    public static String check(String s) {
        String f = "hello";
        int j = 0, flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == f.charAt(j)) {
                j++;
                flag++;
            }
            if (flag == 5) {
                return "YES";
            }
        }
        return "NO";

    }
}
