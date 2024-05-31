import java.util.*;
// stack = LIFO배열

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> arr = new Stack<Integer>();
        
        int count=0;
        
        while(n>0 && n<1000_000_000){
            count++;
            arr.add(n%3);
            n= n/3;
            if(n == 0){
                break;
            }
        }
        for(int i=0; i<count; i++){
            answer += arr.pop() * (Math.pow(3,i));
        }
        
        return answer;
    }
}