import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long E = sc.nextLong();

        long F = (long)Math.pow(A, 2) +
                (long)Math.pow(B, 2) +
                (long)Math.pow(C, 2) +
                (long)Math.pow(D, 2) +
                (long)Math.pow(E, 2);

        long answer = F%10;
        
        System.out.println(answer);

    }
}