import java.util.*;
public class SkiResort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long tMax=sc.nextLong();
            int count=0;
            long ans=0;

            long[] arr=new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
                if(arr[i]<=tMax){
                    count++;
                }else{
                    if(count>=k){
                        int validLength = count- k + 1;
                        ans += (long) validLength * (validLength + 1) / 2;
                        
                    } 
                    count=0;
                }    
            }
            if(count>=k){
                int validLength = count- k + 1;
                ans += (long) validLength * (validLength + 1) / 2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
