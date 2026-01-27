import java.util.*;
public class Main{
    public static void main(String[] args){
        String result = null;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            result = ">";
        }else if(a < b){
            result = "<";
        }else {
            result = "==";
        }
        System.out.println(result);
    }
}