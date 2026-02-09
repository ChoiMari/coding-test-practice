import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //테스트 개수
        int t = Integer.parseInt(br.readLine());
        for(int i = 1;i <= t;i++){
            String[] str = br.readLine().split("\\s+");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            //정수로 변환해야 함.(안하면 유니코드에 해당하는 문자로 써짐)
            bw.write("Case #" + i + ": " + a + " + " + b 
                    + " = " + (a + b));
            bw.newLine(); 
        }
        bw.flush();
        br.close();
        bw.close();
    }
}