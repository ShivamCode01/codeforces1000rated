import java.util.*;
public class DigSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            boolean flag=false;
            if((y-x)==1 ||  (x-y)==8 || (x-y)==17){
                flag=true;
            }
            else{
                int i=0;
                while( i<=111){
                    int mid=9*i;
                    if(x==mid && y==1){
                        flag=true;
                    }
                    i++;
                }
            }
            if(flag==true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
