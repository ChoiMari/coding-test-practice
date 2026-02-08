import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i < t;i++){
            String[] str = br.readLine().split("\\s+");
            int sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            bw.write(String.valueOf(sum)); //String타입으로 넘겨야함
            // int타입으로 써서 출력하면 유니코드 값으로 인식해서 거기에 해당하는 문자가 출력됨
            bw.newLine();// 줄바꿈 씀
        }
        bw.flush();
        
        br.close();
        bw.close();
    }
}