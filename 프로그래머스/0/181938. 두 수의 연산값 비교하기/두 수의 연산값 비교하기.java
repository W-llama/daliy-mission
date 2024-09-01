class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a)+String.valueOf(b);
        int num1 = Integer.parseInt(ab);
        int num2 = 2*a*b;
        
        if(num1 >= num2){
            return num1;
        }else{
            return num2;
        } 
    }
}