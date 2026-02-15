import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int min = first;
        int max = first;
        for(int i = 1;i < n;i++){
            // 1개는 먼저 읽어서 1부터 시작함
            int number = Integer.parseInt(st.nextToken());
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        System.out.printf("%d %d", min, max);
        br.close();
    }
}
