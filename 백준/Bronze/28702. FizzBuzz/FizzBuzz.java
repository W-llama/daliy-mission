import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int result = 0;

        if (isNumber(s1)) { 
            result = Integer.parseInt(s1) + 3;
        } else {
            if (isNumber(s2)) { 
                result = Integer.parseInt(s2) + 2;
            } else {
                if (isNumber(s3)) { 
                    result = Integer.parseInt(s3) + 1;
                }
            }
        }

        if (result % 3 == 0) { 
            sb.append("Fizz");
        }

        if (result % 5 == 0) { 
            sb.append("Buzz");
        }

        if (sb.length() == 0) { 
            sb.append(result);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNumber(String str) {
        return str.matches("[+-]?\\d*(\\.\\d+)?");
    }
}