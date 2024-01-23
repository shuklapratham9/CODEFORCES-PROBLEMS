import java.util.Arrays;
import java.util.Scanner;

public class FormingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(ft(a));
        }
        sc.close();
    }

    public static int ft(int a[]) {
        int w = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int l = 0, h = i - 1;
            while (l < h) {
                if (a[l] + a[h] > a[i]) {
                    w += h - l;
                    h--;
                } else {
                    l++;
                }
            }
        }
        return w;
    }
}
