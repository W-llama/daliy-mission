class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int a = t.length();
        int b = p.length();
        int count= a - b ;
        for (int i=0; i<=count; i++){
            String num = t.substring(i,i+b);
            if(Long.parseLong(num) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}