import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int [] list1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int [] list2 = Arrays.copyOfRange(num_list, 0, n);
        
        int [] answer = new int[num_list.length];
        
        for(int i = 0; i < list1.length; i++){
            answer[i] = list1[i];
        }
        
        for(int i= 0; i < list2.length; i++){
            answer[list1.length+ i] = list2[i];
        }
        
        return answer;
    }
}