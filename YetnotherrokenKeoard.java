import java.util.ArrayList;
import java.util.Scanner;

public class YetnotherrokenKeoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(ss(s));
        }
        sc.close();
    }

    public static String ss(String s) {
        char lc = '0', uc = '0', puc = '0', plc = '0';
        ArrayList<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'B' && c != 'b') {
                l.add(c);
                if ((int) c >= 65 && (int) c <= 90) {
                    puc = uc;
                    uc = c;
                } else {
                    plc = lc;
                    lc = c;
                }
            } else {
                if (!l.isEmpty()) {
                    switch (c) {
                        case 'B':
                            int ind = l.lastIndexOf(uc);
                            if (ind != -1) {
                                l.remove(ind);
                            }
                            uc = puc;
                            break;
                        case 'b':
                            int inf = l.lastIndexOf(lc);
                            if (inf != -1) {
                                l.remove(inf);

                            }
                            lc = plc;
                            break;
                    }
                }
            }
        }
        if (l.isEmpty()) {
            return "\n";
        }
        String f = "";
        for (int i = 0; i < l.size(); i++) {
            f += l.get(i);
        }
        f += "\b";
        return f;
    }

}
