import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        String[] str2 = br.readLine().split("\\s+");
        int[] a = new int[str2.length];
        for(int i = 0;i < a.length;i++){
            a[i] = Integer.parseInt(str2[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int num : a){
            if(num < x){
                sb.append(num + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}