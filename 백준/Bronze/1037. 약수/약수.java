import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        //정렬 → 양쪽에서 쌍 만들기 → 곱하면 항상 -> 원래 숫자
        //정렬 후 맨 앞 × 맨 뒤만 해도 N을 바로 구할 수 있다
        //N = min * max
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); //약수의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[count];
        for(int i = 0;i < count;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        //리턴타입 void로 원본 배열 수정) 오름차순으로 정렬함
        
        int min = numbers[0];
        int max = numbers[count - 1];
        
        System.out.println(min * max);
        br.close();
    }
}