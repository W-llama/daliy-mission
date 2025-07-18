import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		int n = Integer.parseInt(br.readLine()); //재료
		int m = Integer.parseInt(br.readLine()); //갑옷
		int [] arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		//재료 저장
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int cnt = 0;
		int i = 0;
		int j = n-1;
		
		while(i<j){
			if(arr[i]+arr[j]<m) {
				i++;
			} else if (arr[i] + arr[j]>m) {
				j--;
				
			} else {
				cnt++;
				i++;
				j--;
			}
		}
		System.out.println(cnt);
	}
}
