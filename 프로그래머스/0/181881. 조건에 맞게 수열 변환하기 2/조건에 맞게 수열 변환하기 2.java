class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean isChanged;
        
        do{
            isChanged = false;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                    isChanged = true;
                }else if (arr[i] < 50 && arr[i] % 2 ==1){
                    arr[i] =arr[i]*2 +1;
                    isChanged =true;
                }
            }
            answer ++;
        } while (isChanged);
        
        return answer -1;
    }
}