import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        long answer = (long)Math.pow(A, 2) - (long)Math.pow(B, 2);

        System.out.println(answer);

    }
}