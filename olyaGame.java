import java.util.*;
public class olyaGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int nn=sc.nextInt();
            int[] brr=new int[nn];
            for(int j=0; j<nn; j++){
                brr[j]=sc.nextInt();
            }
            Arrays.sort(brr);
            int fMin=brr[0];
            int sMin=brr[1];
            long ans=brr[0];

            for(int i=1; i<n; i++){
                int m=sc.nextInt();
                int[] arr=new int[m];
                for(int j=0; j<m; j++){
                    arr[j]=sc.nextInt();
                }
                Arrays.sort(arr);
                if(arr[1]<=sMin){
                    if(arr[0]<=fMin){
                        ans-=fMin;
                        ans+=sMin;
                        fMin=arr[0];
                        sMin=arr[1];
                        ans+=fMin;
                    }else{
                        ans+=arr[1];
                    }
                }else{
                    if(arr[0]<fMin){
                        ans-=fMin;
                        ans+=arr[0];
                        fMin=arr[0];
                    }
                    ans+=arr[1];
                }
                //  System.out.println("i :"+i+" ,ans :"+ans);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
