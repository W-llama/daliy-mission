class Solution {
    public int solution(int[] number) {
        int a = 0;
        int b = 0;
        int c = 0;
        int sum = 0;
        int answer = 0;
        
        for(int i = 0; i<number.length-2; i++){
            a = number[i];
            for(int j = i+1; j<number.length-1; j++){
                b =  number[j];
                for(int k = j+1; k<number.length; k++){
                    c = number[k];
                    
                    sum = a + b + c;
                    if(sum == 0){
                        answer++;
                    }
                }
            }
        }
    
        return answer;
    }
}