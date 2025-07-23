import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            int first_abs = Math.abs(a);
            int second_abs = Math.abs(b);

            if(first_abs == second_abs) {
                return a > b ? 1 : -1;
            } else {
                return first_abs - second_abs;
            }
        });
        
        for(int i = 0; i < n; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(pq.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(request);
            }
        }
    }
}