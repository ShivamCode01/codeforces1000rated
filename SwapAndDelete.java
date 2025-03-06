import java.util.*;
public class SwapAndDelete {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        String s=sc.next();
        HashMap<Integer,int[]>hm=new HashMap<>();
        int cntZero=0;
        int cntOne=0;
        int res=0;
        int n=s.length();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                cntZero++;
            }else{
                cntOne++;
            }
            hm.put(i,new int[]{cntZero,cntOne});
        }
        int diff=Math.abs(cntZero-cntOne);
        // System.out.println("diff : "+diff+" cntZero : "+cntZero+ " cntOne : "+cntOne);
        if(cntOne==0){
            res=cntZero;
        }else if(cntZero==0){
            res=cntOne;
        }else if(cntOne==cntZero){
            res=0;
        }else if(cntZero<cntOne){
            if(hm.get(n-diff-1)[1]<=cntZero && hm.get(n-diff-1)[0]<=cntOne){
                res=diff;
            }else{
                res=cntOne;
            }
        }else{
            if(hm.get(n-diff-1)[1]<=cntZero && hm.get(n-diff-1)[0]<=cntOne){
                res=diff;
            }else{
                res=cntZero;
            }
        }
        System.out.println(res);
      }
      sc.close();  
    }
}
