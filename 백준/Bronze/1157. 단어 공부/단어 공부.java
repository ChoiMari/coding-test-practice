import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase(); //입력문자열을 대문자로 변환
        int[] count = new int[26]; //인덱스 자리 a ~ z 26개
        for(int i = 0;i < str.length();i++){
            count[str.charAt(i) - 'A']++;
            //해당하는 인덱스 자리의 값을 1증가
        }
        char result = '?';
        int max = -1;
        for(int i = 0; i < count.length;i++){
            if(count[i] > max){
                max = count[i];
                result = (char) (i + 'A');
            }else if(count[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}