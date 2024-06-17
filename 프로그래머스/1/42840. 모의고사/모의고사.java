import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> test = new ArrayList<>();
        int[] last = new int [3];
        // 1,2,3번
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == num1[i%num1.length]){
                last[0]++;
            }
            if(answers[i] == num2[i%num2.length]){
                last[1]++;
            }
            if(answers[i] == num3[i%num3.length]){
                last[2]++;
            }
        }
        
        int max=0;
        for(int i:last){
            max=Math.max(i,max);
        }
        
        for(int i=0; i<3 ;i++){
            if(last[i]==max){
                test.add(i+1);
            }
        }
        int size= test.size();
        int[] answer = new int[size];
        for(int i=0; i<size;i++){
            answer[i]=test.get(i);
        }
        return answer;
    }
}