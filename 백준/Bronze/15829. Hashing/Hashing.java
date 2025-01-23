import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum = 0;
        long power =1;

        for(int i=0; i<N; i++) {
            sum = (sum + (str.charAt(i)-96)*power)%1234567891;
            power = 31*power%1234567891;
        }
        System.out.println(sum);
    }
}