import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                stack.pop();
            }else {
                stack .push(number);
            }
        }
        
        int sum = 0;
        for(int o : stack){
            sum += o;
        }
        System.out.println(sum);
    }
}