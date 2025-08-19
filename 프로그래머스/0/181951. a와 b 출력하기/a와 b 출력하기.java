import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 공백을 포함하여 받음
        String[] str2 = str.split(" "); // 공백을 기준하여 자르고 그걸 String 배열에 저장
        
        System.out.printf("a = %s\n", str2[0]);
        System.out.printf("b = %s", str2[1]);
        
        //리소스 닫음
        sc.close();
    }
}