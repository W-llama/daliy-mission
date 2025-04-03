import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int m = 1;
        
        while(m<n){
            m*=2;
        }
        int [] answer = new int [m];
        
        Arrays.fill(answer, 0);
        
        System.arraycopy(arr, 0, answer, 0, n);
        return answer;
    }
}