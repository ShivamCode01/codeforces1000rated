import java.util.*;
public class Aquarium {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long h=Integer.MAX_VALUE;
            long l=0;
            int n=sc.nextInt();
            Long maxWater=sc.nextLong();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            while(l<h){
                long mid=l+(h-l+1)/2;
                // System.out.print(mid+" ");
                long obtWater=0;
                for(int i=0; i<n; i++){
                    obtWater+=Math.max(mid-arr[i],0);
                }
                if(obtWater>maxWater){
                    h=mid-1;
                }else{
                    l=mid;
                }
                //  System.out.println(obtWater+" "+l+" "+h);
            }
            System.out.println(l);
        }
        sc.close();
    }
}
