import java.util.Arrays;

public class Problem2_AssignCookies {
    public static void main(String[] args) {
        int [] g={1,2,3};
        int []s={1,1};
        Problem2_AssignCookies obj = new Problem2_AssignCookies();
        int result = obj.findContentChildren(g, s);
        System.out.println(result);

    }
     public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int child=0;
       int cookie=0;
       while(child<g.length&&cookie<s.length){
        if(s[cookie]>=g[child]){
            child++;
        }
        cookie++;
       }
       return child;
    }
    
}
