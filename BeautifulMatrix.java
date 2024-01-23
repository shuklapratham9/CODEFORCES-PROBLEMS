import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        int cr = 0, cc = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int p = sc.nextInt();
                if (p == 1) {
                    cr = i;
                    cc = j;
                }
                a[i][j] = p;
            }
        }
        System.out.println(Math.abs(cr - 2) + Math.abs(cc - 2));
        sc.close();

    }
}
