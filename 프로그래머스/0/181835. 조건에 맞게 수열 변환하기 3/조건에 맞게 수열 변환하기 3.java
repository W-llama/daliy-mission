class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        if(k%2 == 1){
            for(int i = 0; i<arr.length; i++){
                arr[i] = arr[i]*k;
            }
        }else{
            for(int i = 0; i<arr.length; i++){
                arr[i] = arr[i] + k;
            }
        }
        answer = arr;
        return answer;
    }
}