import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        String dna = br.readLine();
        st = new StringTokenizer(br.readLine());
        
        int[] need = new int[4]; // A, C, G, T 필요 개수
        int[] count = new int[4]; // 현재 윈도우의 개수
        
        for(int i = 0; i < 4; i++) {
            need[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = 0;
        
        // 첫 번째 윈도우
        for(int i = 0; i < P; i++) {
            count[getIndex(dna.charAt(i))]++;
        }
        if(isValid(count, need)) result++;
        
        // 슬라이딩 윈도우
        for(int i = P; i < S; i++) {
            count[getIndex(dna.charAt(i))]++; // 새로운 문자 추가
            count[getIndex(dna.charAt(i-P))]--; // 이전 문자 제거
            if(isValid(count, need)) result++;
        }
        
        System.out.println(result);
    }
    
    static int getIndex(char c) {
        return c == 'A' ? 0 : c == 'C' ? 1 : c == 'G' ? 2 : 3;
    }
    
    static boolean isValid(int[] count, int[] need) {
        for(int i = 0; i < 4; i++) {
            if(count[i] < need[i]) return false;
        }
        return true;
    }
}