import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 과목 수 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        int[] scoreArr = new int[n];
        scoreArr[0] = Integer.parseInt(st.nextToken());
        int max = scoreArr[0];
        
        for(int i = 1;i < n;i++){
            scoreArr[i] = Integer.parseInt(st.nextToken());
            if(max < scoreArr[i]){
                max = scoreArr[i];
            }
        }
        double sum = 0;
        for(int score : scoreArr){
            sum += (double)score / max * 100; //총점
        }
        double avg = sum / n;
        System.out.println(avg);
    }
}