import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s+");
        int n = Integer.parseInt(str[0]);// 바구니 개수
        int m = Integer.parseInt(str[1]);// 역순으로 바꿀 횟수
        
        int[] numbers = new int[n];//바구니 n개 만큼 생성
        for(int i = 0; i < n; i++){// 바구니 초기화
            numbers[i] = i + 1;//배열에 1 ~ n번까지 저장
            //인덱스는 0 ~ (n - 1)
        }
        
        // 역순
        for(int x = 0;x < m;x++){//m회 반복
            String[] str2 = br.readLine().split("\\s+");
            int i = Integer.parseInt(str2[0]) - 1;
            int j = Integer.parseInt(str2[1]) - 1;
            
            while(i < j){
            //양쪽에서 하나씩 중앙으로 오면서 서로 위치 바꿈
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : numbers){
            sb.append(num).append(" ");
        }
        
        System.out.print(sb.toString().trim());
    }
}