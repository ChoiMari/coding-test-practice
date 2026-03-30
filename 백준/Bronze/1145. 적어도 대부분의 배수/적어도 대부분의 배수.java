import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("\\s+");
        int num1 = 1;
        while(true){
            int count = 0;
            for(int i = 0;i < strArr.length;i++){
                int num2 = Integer.parseInt(strArr[i]);
                if(num1 % num2 == 0){
                    count++;
                }
            }
            if(count >= 3){
                break;
            }
            num1++; 
            //여기가 실행되면 3개로 나누어 떨어지지 않았다는 것
        }
        System.out.println(num1);
        br.close();
    }
}