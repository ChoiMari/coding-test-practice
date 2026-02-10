import java.util.*;
public class Main{
    public static void main(String[] args){
        //문제에 제시된 입력 크기가 작아서 Scanner 객체 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            for(int j = (n - i);j > 0;j--){
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}