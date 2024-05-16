import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Arrays.sort(arr); //배열정렬

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }else continue;
        }

        if(arrList.size()<1){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            answer = new int[arrList.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = arrList.get(i);
            }
        }
        return answer;
    }
}