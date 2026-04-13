import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s));
        String str = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
        //reverse()메서드 사용 위해서 StringBuilder객체로 감쌈
        sb.append(str);
        sb.append(my_string.substring(e + 1));
        return sb.toString();
    }
}