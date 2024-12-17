import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A+B;
        int dif = A-B;
        int mul = A*B;
        int mok = A/B;
        int mod = A%B;

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(mul);
        System.out.println(mok);
        System.out.println(mod);

    }
}