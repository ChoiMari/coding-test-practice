import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        
        int count = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(num == v){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
    
    //st.nextToken()은
    // 토큰이 없으면 예외발생함
}