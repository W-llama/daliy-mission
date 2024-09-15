import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int num = numer1*denom2 + numer2*denom1;
        int den = denom1*denom2;
        int max = 1;
        
        for(int i=1; i <= num && i<= den; i++){
            if(num%i==0 && den%i==0){
                max = i;
            }
        }
        
        answer[0] = num/max;
        answer[1] = den/max;
        
        return answer;
    }
}