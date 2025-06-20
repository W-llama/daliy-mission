import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n =Integer.parseInt(br.readLine());
        String a = br.readLine();
        char[] cNum = a.toCharArray();
        int answer = 0;
        
        for(int i=0; i< cNum.length; i++){
            answer += cNum[i] - '0';
        }
        System.out.println(answer);
    }
}