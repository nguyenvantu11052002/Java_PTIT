package newclass;

import java.util.*;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i != 0) {
                    a[i] += a[i - 1];
                }
            }
            boolean ok = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] == a[n - 1] - a[i]) {
                    System.out.println(i + 1);
                    ok = true;
                    break;
                }
            }
            if (ok == false) {
                System.out.println("-1");
            }
        }
    }
}
