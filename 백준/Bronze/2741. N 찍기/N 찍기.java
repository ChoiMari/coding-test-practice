import java.util.*;
public class Main{
    public static void main(String[] args){
        //대용량 입력 아니라서 Scanner객체로 받음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++){
            sb.append(i).append("\n");
        }
        System.out.print(sb);
        sc.close();
    }
}