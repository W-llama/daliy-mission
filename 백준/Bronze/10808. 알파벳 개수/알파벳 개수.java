import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int [] arr = new int[26]; // alphabet size
        String str = br.readLine();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch - 97]++; // arr[ch - 'a']++; 와 같음
        }

        // 값 출력
        for(int i= 0; i<26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
