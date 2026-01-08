class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) +  overwrite_string + my_string.substring(s + overwrite_string.length());
        //인덱스0부터 s직전까지 가져옴 + overwrite_string + 나머지 my_string부분
        return answer;
    }
}