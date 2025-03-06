import java.util.*;
public class HelmetsInLN{
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public int compareTo(Pair other) {
            // Sort by y in ascending order
            if (this.y != other.y) {
                return Integer.compare(this.y, other.y);
            }
            // If y values are the same, sort by x in descending order
            return Integer.compare(other.x, this.x);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();

            PriorityQueue<Pair> pq=new PriorityQueue<>();
            int[] arr=new int[n];
            int[] brr=new int[n];
            int p=sc.nextInt();
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                // System.out.print(arr[i]+" ");
            }
            // System.out.println();
            for(int i=0; i<n; i++){
                brr[i]=sc.nextInt();
                // System.out.print(brr[i]+" ");
            }
            // System.out.println();
            for(int i=0; i<n; i++){
                pq.add(new Pair(arr[i],brr[i]));
            }

            long ans=p;
            int j=0;
            int r=0;
            while(j<n && r<n-1){
                Pair l=pq.remove();
                int a=l.x;
                int b=l.y;
                if(j>r){
                    ans+=p;
                    r++;
                }
                if(b<p && r<n-1){
                    int lft=a;
                    while(lft>0 && r<n-1){
                        ans+=b;
                        r++;
                        lft--;
                    }
                }
                //  System.out.println("j,r,a,b,ans :"+j+" "+r+" "+a+" "+b+" "+ans );
                j++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}