import java.util.*;
public class Monsters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[][] arr=new int[n][2];

            for(int i=0; i<n; i++){
                int a=sc.nextInt();
                arr[i][0]= ((a%k)==0)?k:(a%k);
                arr[i][1]=i;
            }
            Arrays.sort(arr, (a, b) -> {
                // If 0th column is different, sort in descending order
                if (a[0] != b[0]) {
                    return b[0] - a[0]; // Descending for 0th column
                }
                // If 0th column is same, sort 1st column in ascending order
                return a[1] - b[1]; // Ascending for 1st column
            });
            for(int i=0; i<n; i++){
                System.out.print((arr[i][1]+1)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
