class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int nummul = 1;
        int summul = 0;
        
        for(int i = 0; i<num_list.length; i++){
            nummul *= num_list[i];
            summul += num_list[i];
        }
        
        int summul2 = (int)Math.pow(summul , 2);
        
        if(nummul < summul2){
            return answer = 1;
        }else{
            return answer = 0;
        }
    }
}