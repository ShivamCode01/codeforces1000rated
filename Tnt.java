import java.util.*;
public class Tnt {
    public static Long func(long[] nums, int i){
        int j=0;
        Long maxi=0L;
        Long mini=0l;       
        while(j<i){
            maxi+=nums[j++];
        }
        mini=maxi;
        // System.out.println("for"+i+"Min->"+mini+" Max->"+maxi);
        while(j<nums.length){
            Long sum=0l;
            for(int k=0;k<i;k++){
                sum+=nums[j++];
            }
            // System.out.println("for "+j+"->"+sum);
            maxi=Math.max(maxi,sum);
            mini=Math.min(mini,sum);
            // System.out.println();
        }
        return (maxi-mini);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
        int n=sc.nextInt();
        long[] arr=new long[n];
        Long ans=0l;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
        }
        for(int i=1; i<n; i++){
            if(n%i==0){
                Long res=func(arr, i);
                // System.out.println(i+"->"+res);
               ans=Math.max(ans,res);
            }
        }
        System.out.println(ans);
       }
       sc.close(); 
    }
}
