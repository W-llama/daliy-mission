import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        String a = sc.next();
        sc.close();
        
        int answer = 0;
        
        for(int i=0; i<n; i++){
            answer += a.charAt(i)-'0';
        }
        System.out.println(answer);
    }
}