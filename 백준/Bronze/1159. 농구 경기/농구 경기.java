import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] count = new int[26];//소문자 a ~ z
        for(int i = 0;i < n;i++){
            char firstChar = br.readLine().charAt(0);//첫글자만 반환받아 검사
            count[firstChar - 'a']++;
            //예) a면 index 0번의 값 ++
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < count.length;i++){
            if(count[i] >= 5){
                sb.append((char) (i + 'a'));
            }
        }
        String result = (sb.toString().length() != 0) ? sb.toString() : "PREDAJA";
        System.out.println(result);
        br.close();
    }
}