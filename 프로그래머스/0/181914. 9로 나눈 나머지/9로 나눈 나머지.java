class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char digit : number.toCharArray()){
            answer += digit - '0';
        }
        return answer % 9;
    }
}