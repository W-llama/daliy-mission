import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N: 숫자 개수, L: 윈도우 크기
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq = new LinkedList<>(); //양쪽에서 삽입/삭제가 가능한 큐

        for (int i = 0; i < N; i++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - L + 1) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && A[dq.peekLast()] > A[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // 결과 출력
            bw.write(A[dq.peekFirst()] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
