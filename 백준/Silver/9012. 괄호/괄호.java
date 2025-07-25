import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i< T; i++){
            sb.append(solve(br.readLine())).append("\n");
        }

        System.out.println(sb);
    }

    public static String solve(String str){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            
            if(c == '('){
                stack.push(c);
            }else if(stack.empty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }   
}