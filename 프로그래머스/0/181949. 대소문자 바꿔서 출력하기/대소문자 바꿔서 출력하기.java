import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder(); 
        //String은 문자열 누적 시 메모리 공간을 새로 만드므로, 리소스 절약을 위해 StringBuilder객체 사용
        
        //람다보다 반복문이 대용량 처리가 더 빠르다고 함
        //Stream은 객체를 계속 만든다고
        for(int i = 0 ; i < a.length() ; i++) { //문자열 a의 길이까지 반복
            char ch = a.charAt(i);
            
            // 알파벳 입력이 아닌 경우
            if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))){
                throw new IllegalArgumentException("영어 알파벳만 허용됩니다.");
            }
            
            // ASCII 직접 비교, 문자열 판별 내장 메서드(Character.isUpperCase,toLowerCase) 방법이 있는데
            // 성능은 ASCII 직접 비교가 더 좋다고 함
            if(ch >= 'A' && ch <= 'Z'){
               //대문자인 경우('A' = 65와 같음)
                result.append((char) (ch + 32)); //대문자 시작 65고 소문자 시작이 97이라서
                // 그 차이만큼 더해서 소문자로 변환함
                //Character + int => int이기 때문에 casting 필요
                //toLowerCase()써도 됨
            } else if(ch >= 'a' && ch <= 'z'){
                result.append((char) (ch - 32)); //소문자로 변환
            } else{
                throw new IllegalArgumentException("영어 알파벳만 허용됩니다.");
            }
        }
        
        System.out.println(result);
        
    }
}

/*
[공부용 정리]
public char charAt(int index)
주어진 인덱스위치에 있는 문자를 char타입으로 반환함
*/