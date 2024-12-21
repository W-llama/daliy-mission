import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch;
        String answer = "";
        
        for (int i=0; i< str.length(); i++) {
            ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            }
        }
        
        System.out.println(answer);
    }
}