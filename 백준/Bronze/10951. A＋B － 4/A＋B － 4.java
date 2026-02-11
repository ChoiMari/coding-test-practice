import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader : 보조스트림객체(성능 위해 감싸서 사용)
        //InputStreamReader : 바이트 -> 문자열 변환 입력 스트림 객체
        //System.in : 입력 객체
        StringBuilder sb = new StringBuilder();
        //문자열 누적 시 메모리 절약
        
        String line = null;
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line); 
            //문자열 파싱 위해서 사용(split보다 빠름)
            // 생성자 > 첫번째 파라미터 : 분리할 문자열
            // 두번째 파라미터 : 구분자(생략하면 공백)
            int a = Integer.parseInt(st.nextToken());
            // 다음 토큰을 반환
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b); // int타입 저장해도 상관없음
            // 오버로딩 되어있고, 내부에서 문자열로 변환해서 저장함
            sb.append("\n");
        }
        System.out.println(sb);
    }
}