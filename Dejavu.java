import java.util.*;
public class Dejavu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            Long[] arr=new Long[x];
            Long[] mod=new Long[y];
            for(int i=0; i<x; i++){
                arr[i]=sc.nextLong();
            }
            for(int i=0; i<y; i++){
                mod[i]=sc.nextLong();
            }
            HashSet<Long> hs=new HashSet<>();
            for(int i=0; i<y; i++){
                if(hs.contains(mod[i])) continue;
                hs.add(mod[i]);
                for(int j=0; j<x; j++){
                    if(arr[j]%(1<<mod[i])==0) arr[j]+=(1<<(mod[i]-1));
                }
            }
            for (Long l:arr) {
                System.out.print(l+" ");
            }
            System.out.println();       
        }
        sc.close();
    }
}
