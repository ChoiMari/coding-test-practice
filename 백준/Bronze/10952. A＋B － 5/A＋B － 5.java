import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while((str = br.readLine()) != null){
            String[] s = str.split("\\s+");
            int a = Integer.parseInt(s[0]);  
            int b = Integer.parseInt(s[1]);
            if(a == 0 && b == 0){
                break;
            }
            bw.write(String.valueOf(a + b)); //변환해서 써야함
            // 정수로 쓰면 그 숫자에 해당하는 문자로 써짐
            bw.newLine(); //계행
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}