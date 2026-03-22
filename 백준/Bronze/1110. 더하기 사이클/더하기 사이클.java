import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0; //-> 싸이클 길이
        int current = n;
        do{
            int tens = current / 10;//십의 자리
            int ones = current % 10;//일의자리
            int sum = tens + ones;
            current = (ones * 10) + (sum % 10); 
            count++;
        }while(current != n);
        System.out.println(count);
        br.close(); //리소스 정리
    }
}