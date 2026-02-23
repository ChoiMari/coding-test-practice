import java.io.*;
import java.util.*;
/*
[문제 요약]
a^b개의 데이터를 1~10번 컴퓨터가 순서대로 처리한다.
→ 마지막 데이터가 처리되는 컴퓨터 번호는 (a^b) % 10
→ 단, 나머지가 0이면 10번 컴퓨터

[핵심 개념]
1. (a^b) % 10 만 구하면 된다.
2. (a^b) % 10 = ((a % 10)^b) % 10
   → 밑(a)은 일의 자리만 의미 있다.
3. 일의 자리 거듭제곱은 최대 4개 패턴으로 반복된다.
   → 지수 b를 4로 나눈 나머지만 사용하면 된다.
4. b % 4 == 0이면 패턴의 마지막 값(4번째) 사용.

[시간복잡도]
각 테스트케이스당 O(1)
*/
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); //테스트 개수
        
        //while(t-- > 0) {}도 가능 t번 반복
        for(int i = 1;i <= t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            //밑은 1의 자리만 사용
            int base = a % 10;
            int exponent = b % 4; //지수 줄이기
            //(패턴의 최대길이 4로 나눈 나머지)
            if(exponent == 0){ //지수를 패턴의 최대값 4로 나눈 나머지가 0이면
                // 패턴의 4번째 사용
                exponent = 4;
            }
            
            int value = 1; //곱하기 기본값 1
            //0으로 설정하면 뭘 곱해도 0
            
            for(int j = 1; j <= exponent;j++){
                //exponent(지수)번 반복 -> 거듭제곱
                //pow()는 리턴타입 double이여서
                value *= base; 
            }
            //컴퓨터 번호 추출
            int result = value % 10;
            //단, 나머지가 0인 경우 10번 컴퓨터이므로
            if(result == 0){
                result = 10;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
/*
a^b를 10으로 나눈 나머지가 컴퓨터 번호(결과값)
나머지가 0일 땐 10번 컴퓨터
그러나 pow()를 써서 a^b를 직접 구할 순 없다.
이유 : 오버플로우

그럼 어떻게 푸는지? 모듈러 연산 필요
모듈러 연산 = 큰 숫자를 작은 범위에서 동일하게 계산하는 방법
패턴이 있다.
일의 자리 숫자(0~9)의 거듭제곱 패턴 길이는 최대 4이다.

예) 
[2의 거듭제곱] 2 → 4 → 8 → 6 → 반복
[3의 거듭제곱] 3 → 9 → 7 → 1 → 반복
[4의 거듭제곱] 4 → 6 → 반복
[5의 거듭제곱] 5 → 반복
이렇게 최대 반복 패턴 4

3^635를 635번 계산할 필요가 없다
3의 거듭제곱은 패턴이 4개니까
지수 635를 4로 나눈 나머지를 구하면
그 값으로 일의자리를 유추할 수 있음
635 % 4 = 3
3^3의 일의 자리와 똑같다.
만약 지수를 4(패턴값으)로 나눈 나머지가 0이면?
4번째 패턴과 같다는 뜻

13^7의 일의 자리 = 3^7의 일의 자리
13^7 = (10 + 3)^7
10의 배수는 전부 일의 자리가 0이다
(10 + x)^n의 일의 자리 = x^n의 일의 자리
그래서 밑(a)는 일의 자리 숫자만 보면 된다
<요약>
컴퓨터는 10개 → % 10
데이터 개수 = a^b
구할 것 = (a^b) % 10
전체 계산은 불가능
→ 일의 자리만 필요
→ 일의 자리 패턴 반복됨 (최대 4개)
→ b % 4로 위치 찾기
일의 자리 거듭제곱은 반복되므로
a^b의 일의 자리는 a^(b % 패턴길이)와 같다.
b % 4 == 0 인 경우 → 패턴의 마지막 값 사용
*/