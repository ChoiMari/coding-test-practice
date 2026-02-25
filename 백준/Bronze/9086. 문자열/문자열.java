import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){ //t번 반복
            String str = br.readLine();
            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1))
                .append('\n');
        }
        System.out.print(sb);
    }
}