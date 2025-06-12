import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        String[] arr = str.split("");
        for (String s : arr) {
            leftStack.push(s);
        }

        for (int i = 0; i < num; i++) {
            String ldbp = br.readLine();
            char c = ldbp.charAt(0);
            switch(c) {
                case 'L':
                    if(!leftStack.isEmpty())
                        rightStack.push(leftStack.pop());

                    break;
                case 'D':
                    if(!rightStack.isEmpty())
                        leftStack.push(rightStack.pop());

                    break;
                case 'B':
                    if(!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                    break;
                case 'P':
                    char t = ldbp.charAt(2);
                    leftStack.push(String.valueOf(t));

                    break;
                default:
                    break;
            }
        }
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }
        bw.flush();
        bw.close();
    }
}