import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[sc.nextInt()];
        
        int isPN;
        int cnt=0;
        
        for(int i = 0; i<arr.length; i++){
            isPN = sc.nextInt();
            for(int p = 2; p <= isPN; p++){
                if(p== isPN){
                    cnt++;
                }
                if(isPN % p == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}