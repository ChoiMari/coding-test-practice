import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i = 1;i <= t; i++){
            String[] str = br.readLine().split("\\s+");
            int sum = Integer.parseInt(str[0]) 
                + Integer.parseInt(str[1]);
            bw.write("Case #" + i + ": " + String.valueOf(sum));
            //String타입으로 변환해서 써야함(int타입으로 쓰면 유니코드에 해당하는 문자출력됨)
            bw.newLine(); //줄바꿈
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}