import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		int n = Integer.parseInt(br.readLine());
		int sum = 1;
		int cnt = 1;
		int start_index = 1;
		int end_index = 1;
		
		while(end_index != n){
			if(sum == n){
				cnt++;
				end_index++;
				sum+=end_index;
			}else if(sum > n){
				sum-=start_index;
				start_index++;
			}else{
				end_index++;
				sum+=end_index;
			}
		}
		System.out.println(cnt);
	}
}
