import java.util.*;
public class Raspberries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int k=sc.nextInt();
            int even=0;int res=k-1;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]%k==0){
                    res=0;
                }
                if(arr[i]%2==0){
                    even++;
                }
            }
            for(int i: arr){
                int cal=k-(i%k);
                res=Math.min(cal,res);
            }
            if(k!=4){
                System.out.println(res);
            }else{
                if(even>=2){
                    System.out.println(0);
                }else if(even==1){
                    System.out.println(Math.min(1,res));
                }else{
                    System.out.println(Math.min(2,res));
                }
            }    
            
        }
        sc.close();
    }
}
