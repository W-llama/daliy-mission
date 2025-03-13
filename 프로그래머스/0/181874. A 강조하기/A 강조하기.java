class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a", "A");
        answer = myString;
        return answer;
    }
}