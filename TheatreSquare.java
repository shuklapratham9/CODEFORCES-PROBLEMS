import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long rt = (long) (Math.ceilDiv(n, a));
        long ct = (long) (Math.ceilDiv(m, a));
        long ans = rt * ct;
        System.out.println(ans);
        sc.close();
    }
}
