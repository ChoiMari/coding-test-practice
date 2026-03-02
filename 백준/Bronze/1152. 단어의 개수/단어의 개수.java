import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        int result = 0;
        if(!input.isEmpty()){
            result = input.split("\\s+").length;
        }
        System.out.println(result);
        br.close();
    }
}