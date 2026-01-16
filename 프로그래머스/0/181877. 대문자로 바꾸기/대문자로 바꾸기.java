class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        int length = myString.length();
        for(int i = 0;i < length;i++){
            char ch = myString.charAt(i);
            if(!Character.isUpperCase(ch)){
                sb.append(Character.toUpperCase(ch));
                continue;
            }
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
/**
 * 문자 하나가 대문자인지 판별한다.
 *
 * 이 메서드를 쓰는 이유:
 * - 유니코드 기준으로 대문자 여부를 정확히 판별해준다.
 * - 영어 대문자(A~Z)뿐 아니라 다른 언어의 대문자도 포함한다.
 * - 실무에서 직접 비교(A~Z)보다 안전하다.
 *
 * @param ch 검사할 문자
 *           char 타입 하나만 넣는다.
 * @return 대문자이면 true, 아니면 false
 boolean isUpper = Character.isUpperCase(ch);
 */

/**
 * 문자를 대문자로 변환한다.
 *
 * 이 메서드를 쓰는 이유:
 * - 유니코드 기준으로 대소문자 변환을 처리한다.
 * - 영어만 고려한 ('a' - 'A') 계산은 실무에서 바로 컷당한다.
 *
 * @param ch 변환할 문자
 *           단일 char만 전달한다.
 * @return 대문자로 변환된 문자
 *         이미 대문자면 그대로 반환된다.
 char upper = Character.toUpperCase(ch);
 */