import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = -1; 

        // 배열을 순회하며 2의 위치를 찾음
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        // 2가 없으면 [-1] 반환
        if (max == -1) {
            return new int[]{-1};
        }

        // 2가 포함된 최소 부분 배열 반환 copyOfRange(원본배열, 시작점, 끝점)
        return Arrays.copyOfRange(arr, min, max + 1);
    }
}
