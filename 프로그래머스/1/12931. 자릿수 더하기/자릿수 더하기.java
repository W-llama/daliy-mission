import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        char[] c = Integer.toString(n).toCharArray();
        
        for(int i =0; i<c.length; i++){
            answer += c[i] -48;
        }
        
        return answer;
    }
}