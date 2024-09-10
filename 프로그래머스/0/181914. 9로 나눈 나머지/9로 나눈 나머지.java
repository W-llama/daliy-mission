class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char digit : number.toCharArray()){
            answer += Character.getNumericValue(digit);
        }
        return answer % 9;
    }
}