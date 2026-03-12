import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = n;i >= 1;i--){
            bw.write(String.valueOf(i));
            //int타입으로 주면 아스키코드 매핑에 해당하는 문자로 써지기 때문에
            // 숫자 i를 문자열 타입으로 변환해서 써야 원하는 결과가 나온다.
            bw.newLine();//줄바꿈
        }
        bw.flush();
        //리소스 정리
        br.close();
        bw.close();
    }
}