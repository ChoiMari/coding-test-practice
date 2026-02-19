import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set set = new HashSet<>();
        //Set 자료구조 : 순서없음, 중복 허용 안함
        int n = 10; //반복 횟수
        int b = 42; 
        for(int i = 1;i <= n;i++){
            int a = Integer.parseInt(br.readLine());
            set.add(a % b);
            //나머지 저장(중복값은 저장되지 않음)
            // set.size() 중복이 제거된 나머지의 갯수
        }
        System.out.println(set.size());
        br.close();
    }
}