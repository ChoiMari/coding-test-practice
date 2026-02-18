import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] baskets = new int[n];
        for(int i = 0;i < n;i++){
            baskets[i] = i + 1;
        }
        
        for(int j = 1;j <= m;j++){
            int num1 = sc.nextInt() - 1;
            int num2 = sc.nextInt() - 1;
            int temp = baskets[num1];
            baskets[num1] = baskets[num2];
            baskets[num2] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int basket : baskets){
            sb.append(basket).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}