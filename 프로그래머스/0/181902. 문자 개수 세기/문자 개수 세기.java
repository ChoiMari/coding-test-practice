class Solution {
    public int[] solution(String my_string) {
        /*인덱스 A ~ z (0 ~ 52)*/
        int[] alphabet = new int[52];
        for(int i = 0;i < my_string.length();i++){
           char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
               alphabet[ch - 'A']++;
           }else{ //소문자면 실행
                alphabet[ch - 'a' + 26]++;
            }
        }
        return alphabet;
    }
}