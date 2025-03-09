class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        
        for (int num : num_list) {
            while (num > 1) {
                cnt++; 
                
                if (num % 2 == 0) {
                    num /= 2; 
                } else {
                    num = (num - 1) / 2; 
                }
            }
        }
        
        return cnt;
    }
}
