class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] temp = {};
        
        temp = binomial.split(" ");
        int a = Integer.parseInt(temp[0]);
        String op = temp[1];
        int b = Integer.parseInt(temp[2]);
        
        switch(op){
            case("+"):
                    answer = a+b;
                break;
            case("-"):
                    answer = a-b;
                break;
            case("*"):
                    answer = a*b;
                break;
        }
        return answer;
    }
}