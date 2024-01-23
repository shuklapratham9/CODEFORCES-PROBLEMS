import java.util.Arrays;
import java.util.Scanner;

public class VeryDifferentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(md(a, b, n, m));
        }
        sc.close();
    }

    public static long md(int a[], int b[], int n, int m) {
        Arrays.sort(a);
        int c = 0;
        Arrays.sort(b);
        int i = 0, j = m - 1;
        long s = 0;
        while (c != n) {
            s = s + Math.abs(a[i] - b[j]);
            i++;
            j--;
            c++;
        }
        return s;

    }

}
