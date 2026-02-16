import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니 갯수
        int m = sc.nextInt(); // 공 넣는 횟수
        
        int[] baskets = new int[n];
        
        for(int a = 0;a < m;a++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int k = sc.nextInt();
            for(int b = i; b <= j; b++){
              baskets[b] = k;
            }
        }
        
        for(int basket : baskets){
           System.out.print(basket + " ");
        }
    }
}