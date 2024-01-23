import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(mind(x, y, a, b));
        }
        sc.close();
    }

    public static long mind(int x, int y, int a, int b) {
        if (x == 0 && y == 0) {
            return 0;
        }
        if (x == y) {
            return x * b;
        }
        return (Math.min(x, y) * b + (Math.max(x, y) - Math.min(x, y)) * a);
    }
}
