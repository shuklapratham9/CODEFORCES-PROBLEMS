import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int sx = 0, sy = 0, sz = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            sx += a[i][0];
            sy += a[i][1];
            sz += a[i][2];
        }
        if (sx == 0 && sy == 0 && sz == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
