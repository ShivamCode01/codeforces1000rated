import java.util.*;
public class CollectingGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] ans=new int[n];
            List<List<Integer>> v=new ArrayList<>();
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                v.add(Arrays.asList(arr[i],i));
            }
            v.sort(Comparator.comparingInt((List<Integer> a) -> a.get(0))
                 .thenComparingInt(a -> a.get(1)));

            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0; i<n; i++){
                hm.put(v.get(i).get(1),i);
                // System.out.println(v.get(i).get(1)+","+i);
            }
            Arrays.sort(arr);
            long pf[]=new long[n];
            pf[0]=arr[0];
            for(int i=1; i<n; i++){
                pf[i]=pf[i-1]+arr[i];
            }

            int[] dp=new int[n];
            dp[n-1]=n-1;
            for(int i=n-2; i>=0; i--){
                // System.out.println(pf[i]+"->"+arr[i+1]);
                dp[i]= pf[i]<arr[i+1]? i:dp[i+1];
            }
            for(int i=0; i<n; i++){
                ans[i]=dp[hm.get(i)];
            }
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}