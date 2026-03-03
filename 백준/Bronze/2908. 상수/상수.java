import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        String str1 = st.nextToken();
        String str2 = st.nextToken();
                                                
        for(int i = 2;i >= 0;i--){
            sb1.append(str1.charAt(i));
            sb2.append(str2.charAt(i));
        }
        
        int a = Integer.parseInt(sb1.toString());
        int b = Integer.parseInt(sb2.toString());
        System.out.println((a > b) ? a : b);
    }
}