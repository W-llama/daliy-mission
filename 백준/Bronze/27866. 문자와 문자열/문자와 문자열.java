import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int num = sc.nextInt();

        char a = s.charAt(num - 1);

        System.out.println(a);

        sc.close();

    }
}