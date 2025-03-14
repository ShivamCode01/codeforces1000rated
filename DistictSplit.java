//  Its not just ki jaha first double occuring charchter dikha waha pe spilt man lo , in this case we will miss best option bcz in some testcase like this aaczzbcd if  you split at a then the first c will just fall into second string leading to a loss of 1 if it could be twice in count if slpit occur at z then one c will be in one first string and other c in second leading to 2 addition and still other two z .
// So we will split at each place and see what could be the optimum result

import java.util.*;
public class DistictSplit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            int[] totalOcc=new int[26];
            int[] presentOcc=new int[26];
            for(char c:s.toCharArray()){
                totalOcc[c-'a']++;
            }
            for(char c:s.toCharArray()){
                totalOcc[c-'a']--;
                presentOcc[c-'a']++;
                int cur=0;
                for(int i=0; i<26; i++){
                    cur+= Math.min(1,totalOcc[i])+Math.min(1,presentOcc[i]);
                }
                ans=Math.max(ans,cur);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}