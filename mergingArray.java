import java.util.*;
public class mergingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            int[] a=new int[n+1];
            int[] b=new int[n+1];
            for(int i=1; i<=n; i++){
                a[i]=sc.nextInt();
            }
            for(int i=1; i<=n; i++){
                b[i]=sc.nextInt();
            }
            int[] fa=new int[n+n+1];
            int[] fb=new int[n+n+1];

            int p = 1;
            for (int i = 2; i <= n; ++i)
            {
            if (a[i] != a[i - 1])
                {
                    fa[a[i - 1]] = Math.max(fa[a[i - 1]], i - p);
                    p = i;
                }
            }
            fa[a[n]] = Math.max(fa[a[n]], n - p + 1);

            p = 1;
            for (int i = 2; i <= n; ++i)
            {
                if (b[i] != b[i - 1])
                {
                    fb[b[i - 1]] = Math.max(fb[b[i - 1]], i - p);
                    p = i;
                }
            }
            fb[b[n]] = Math.max(fb[b[n]], n - p + 1);
                for(int i=1; i<n+n+1;i++){
                    ans=Math.max(ans,fa[i]+fb[i]);
                }
                System.out.println(ans);
        }
        sc.close();
    }
}
