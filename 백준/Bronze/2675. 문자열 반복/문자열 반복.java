import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       StringBuilder sb = new StringBuilder();
       int n = Integer.parseInt(br.readLine());
       
       for(int i = 0;i < n;i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int r = Integer.parseInt(st.nextToken());
           String s = st.nextToken();
           char[] charArr = s.toCharArray();
           for(int j = 0;j < s.length();j++){
               for(int k = 0;k < r;k++){
                   sb.append(charArr[j]);
               }   
           }
           sb.append("\n");
       }
       System.out.println(sb);
    }
}