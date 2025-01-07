import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int [] arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++){
            arr [i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }
        }
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += (double) arr[i]/max*100;
        }
        answer /= N;

        System.out.println(answer);
        
    }
}