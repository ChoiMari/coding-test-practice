import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("\\s+");
        int[] numbers = new int[n];
        
        for(int i = 0;i < n;i++){
            numbers[i] = Integer.parseInt(str[i]);
        }
        
        int min = numbers[0];
        int max = numbers[0];
        for(int num : numbers){
            if(num < min){
                min = num;
            }
            
            if(num > max){
                max = num;
            }
        }
        System.out.printf("%d %d", min, max);
        br.close();
    }
}