import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); 
        
        st = new StringTokenizer(br.readLine());
        int[] count = new int[M];
        int sum = 0; 
        
        count[0] = 1; 
        
        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            sum = (sum + number) % M;  
            count[sum]++;
        }
        
        long cnt = 0;  
        for(int i = 0; i < M; i++){  
           cnt += (long)count[i] * (count[i] - 1) / 2;
        }
        System.out.println(cnt);
    }
}