import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       String str = br.readLine();
       
       for(char c = 'a';c <= 'z';c++){
            // indexOf:
            // 해당 문자가 처음 등장하는 위치 반환
            // 없으면 -1 반환
            int index = str.indexOf(c);

            sb.append(index).append(" ");
       }
       System.out.print(sb); 
       br.close();
    }
}