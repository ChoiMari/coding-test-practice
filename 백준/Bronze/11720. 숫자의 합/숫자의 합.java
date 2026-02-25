import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        char[] chArr = br.readLine().toCharArray();
        //String[] strArr = br.readLine().split("");도 가능
        for(char ch : chArr){
           int num = ch - '0'; //char타입 - char타입 연산은 int
           //char가 내부적으로 int타입이기 때문에
           //Integer.parseInt(ch) 이건 오버로딩 되어있지 않아서 사용불가
           result += num;
        }
        System.out.println(result);
        br.close();
    }
}