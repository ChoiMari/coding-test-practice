import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.trim().split("\\s+");
        /*
            \s 공백문자 1개
            \ 이스케이프
            + 1개 이상 반복
        */  
        Long result = 0L;
        for(int i = 0;i < strs.length;i++){
            result += Long.parseLong(strs[i]);
        }
        System.out.println(result);
    }
}