import java.util.*;
public class YarikArray {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=scanner.nextInt();
            }
            int mxSum=arr[0];
            int cs= arr[0];
            int p1=arr[0]&1;
            for(int i=1; i<n; i++){
                if(p1==(arr[i]&1)){
                    mxSum=Math.max(mxSum,cs);
                    cs= arr[i];
                }else{
                    mxSum=Math.max(mxSum,cs);
                    cs= cs+arr[i]<arr[i]?arr[i]:cs+arr[i];
                    p1=p1^1;
                }
            }
            mxSum=Math.max(cs,mxSum);
            System.out.println(mxSum);
        }
        scanner.close();
    }
}
