import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		int n = Integer.parseInt(br.readLine()); 
		int answer = 0;
		long [] arr = new long [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열 저장
		for(int i=0; i<n; i++){
			arr[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int k = 0; k < n; k++){
			long find = arr[k];
			int i = 0;
			int j = n-1;
			
			//2point알고리즘
			while( i < j){
				if(arr[i] + arr[j] == find){
					if(i != k && j != k){
						answer++;
                        break;
					} else if (i==k) {
						i++;
					} else if (j==k) {
						j--;
					}
				}else if(arr[i] + arr[j] <find){
					i++;
				}else {
					j--;
				}
			}
		}
		System.out.println(answer);
	}
}
