class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < myString.length();i++){
            char ch = myString.charAt(i);
            if(Character.isUpperCase(ch)){ //대문자면 실행
                ch = Character.toLowerCase(ch); //소문자로 변환
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}