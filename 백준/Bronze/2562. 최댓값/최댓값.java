import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        numbers[0] = sc.nextInt();
        int max = numbers[0];
        int order = 1;
        for(int i = 1;i < 9;i++){
           numbers[i] = sc.nextInt();
            if(numbers[i] > max){
                max = numbers[i];
                order = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(order);
        sc.close();
    }
}