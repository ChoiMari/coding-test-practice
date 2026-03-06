import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());//파일 이름 개수
        //처음 입력을 기준으로 삼음
        char[] charArr = br.readLine().toCharArray();
        for(int i = 1; i < n; i++){
            String str = br.readLine();
            for(int j = 0;j < str.length();j++){
                if(charArr[j] != str.charAt(j)){
                    charArr[j] = '?';
                }
            }
        }
        System.out.println(String.valueOf(charArr));
        br.close();
    }
}