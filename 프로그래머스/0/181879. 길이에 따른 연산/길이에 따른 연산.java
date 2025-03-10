class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mulanswer = 1;
        if(num_list.length>10){
            for(int i = 0; i<num_list.length; i++){
                answer += num_list[i];
            }
        }else if(num_list.length<=10){
            for(int i = 0; i<num_list.length; i++){
                mulanswer *=num_list[i];
            }
            answer = mulanswer;
        }
        return answer;
    }
}