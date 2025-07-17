import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 계산 및 출력
		System.out.println(getTrimmedMean(arr, 0.15));
	}

	private static int getTrimmedMean(int[] arr, double ratio) {
		Arrays.sort(arr);
		int trim = (int) Math.round(arr.length * ratio);
		double sum = 0;
		for(int i = trim; i < arr.length - trim; i++) {
			sum += arr[i];
		}
		return (int) Math.round(sum / (arr.length - trim * 2));
	}
}

