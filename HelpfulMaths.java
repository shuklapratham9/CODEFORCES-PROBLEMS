import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+') {
                l.add(s.charAt(i) - '0');
            }
        }
        Collections.sort(l);
        String f = "";
        for (int i = 0; i < l.size(); i++) {
            if (i < l.size() - 1) {
                f = f + Integer.toString(l.get(i)) + '+';
            } else {
                f = f + Integer.toString(l.get(i));
            }
        }
        System.out.println(f);
        sc.close();

    }
}
