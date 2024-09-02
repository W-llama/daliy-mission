class Solution {
    public String solution(String code) {
        StringBuilder result = new StringBuilder();
        boolean mode = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
            } else {
                if (mode == (i % 2 == 0)) {
                    result.append(c);
                }
            }
        }
        String answer = result.length() == 0 ? "EMPTY" : result.toString();
        return answer;
    }
}