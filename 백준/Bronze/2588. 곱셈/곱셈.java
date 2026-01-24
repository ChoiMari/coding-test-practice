import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        
        String strNum = String.valueOf(number2);
        
        int num1 = Integer.parseInt(strNum.substring(0,1));
        int num2 = Integer.parseInt(strNum.substring(1,2));
        int num3 = Integer.parseInt(strNum.substring(2,3));
        //문자열에서 인덱스 3은 없지만 포함안하는 경계값이라서 예외가 안남
        
        System.out.println(number1 * num3); //(3)
        System.out.println(number1 * num2); //(4)
        System.out.println(number1 * num1); //(5)
        System.out.println(number1 * number2); //(6)
    }
}