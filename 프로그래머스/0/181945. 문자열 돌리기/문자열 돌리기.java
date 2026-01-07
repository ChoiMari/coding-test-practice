import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        /*
         * toCharArray()
         * - String → char[] 배열로 변환
         */
        char[] chars = a.toCharArray();
        
        /*
         * 문자열을 90도 시계 방향으로 회전시키면
         * → 각 문자를 세로 한 줄씩 출력하는 구조가 된다.
         */
        for(int i = 0 ; i < chars.length ; i++){
            System.out.println(chars[i]);
        }
    }
}