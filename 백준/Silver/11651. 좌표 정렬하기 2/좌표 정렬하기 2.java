import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[N][2];

        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][1] = Integer.parseInt(st.nextToken()); // X 좌표
            arr[i][0] = Integer.parseInt(st.nextToken()); // Y 좌표
        }

        Arrays.sort(arr, (e1, e2)-> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(arr[i][1] + " " + arr[i][0]).append("\n");
        }
        System.out.println(sb);
    }
}