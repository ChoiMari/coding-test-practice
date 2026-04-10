import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        final int n = my_string.length();
        String[] result = new String[n];
        for(int i = 0;i < n;i++){
            result[i] = my_string.substring(i, n);
        }
        Arrays.sort(result);
        return result;
    }
}