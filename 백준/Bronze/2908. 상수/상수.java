import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        int a = reverseNumber(st.nextToken());
        int b = reverseNumber(st.nextToken());
        
        System.out.println(Math.max(a, b));
        br.close();
    }
    
    private static int reverseNumber(String str){
        return Integer.parseInt(new StringBuilder(str).reverse().toString());
    }
}