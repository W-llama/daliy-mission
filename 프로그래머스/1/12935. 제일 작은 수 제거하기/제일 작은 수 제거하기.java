import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min =0;
        int[] copy= arr.clone();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(arr.length ==1){
            answer= new int[1];
            answer[0]=-1;
        }
        else{
            answer= new int[arr.length];
            Arrays.sort(copy);
            min=copy[0];
            int n= arr.length;
            
            for(int i=0; i<arr.length; i++){
                if(arr[i] == min){                    
                    n--;
                    continue;
                }
                list.add(arr[i]);
            }
            
            answer =new int[n];

            for(int i=0; i<n; i++){
                answer[i]= list.get(i);
            }
        }
        
        return answer;
    }
}