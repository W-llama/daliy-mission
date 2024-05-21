class Solution {
    public String solution(String s) {
        String answer = "";
        int n=s.length()/2;
        
        answer =s.length()%2 ==0 ? s.substring(n-1 , n+1) : s.substring(n , n+1);
        return answer;
    }
}