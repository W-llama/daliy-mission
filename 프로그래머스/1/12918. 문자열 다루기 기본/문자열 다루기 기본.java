class Solution {
    public boolean solution(String s) {
        boolean answer = true;
         if (s.length() == 4 || s.length() == 6) {
            // 문자열이 숫자로만 이루어져 있는지 확인
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    return !answer;
                }
            }
            return answer;
        }
        return !answer;
    }
}