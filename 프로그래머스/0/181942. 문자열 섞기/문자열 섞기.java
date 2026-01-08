class Solution {
    public String solution(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        StringBuilder result = new StringBuilder(); 
        //String타입은 불변객체라서 문자열 누적 시마다 메모리를 차지하므로 StringBuilder객체를 사용함
        
        for(int i = 0; i < chars1.length ; i++){
            //result.append(chars1[i] + chars2[i]);
            //char는 내부적으로 숫자(유니코드 정수)
            /*
             append(char)는 문자 그대로를 붙이는 전용 오버로드
             + 연산을 쓰면 char → int 로 승격되어 숫자 덧셈이 되므로 절대 사용하면 안 됨
            */
            //따로 따로 추가를 해준다
            result.append(chars1[i]);
            result.append(chars2[i]);
        }
        
        return result.toString();
    }
}