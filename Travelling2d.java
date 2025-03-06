import java.util.*;

public class Travelling2d {
    static int T;

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        Long[] x = new Long[n + 1];
        Long[] y = new Long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
        }

        long ans = Math.abs(x[s] - x[t]) + Math.abs(y[s] - y[t]);
        long mins = Long.MAX_VALUE / 2, mint = Long.MAX_VALUE / 2;

        for (int i = 1; i <= k; i++) {
            mins = Math.min(mins, Math.abs(x[s] - x[i]) + Math.abs(y[s] - y[i]));
            mint = Math.min(mint, Math.abs(x[t] - x[i]) + Math.abs(y[t] - y[i]));
        }

        ans = Math.min(ans, mins + mint);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        
        while (T-- > 0) {
            solve(sc);
        }
        
        sc.close();
    }
}

