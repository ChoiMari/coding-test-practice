import java.util.Set;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int solution(int a, int b, int c) {
        //같은 숫자 개수가 중요함
        Set<Integer> set = new HashSet<>(List.of(a, b, c));
        //중복 제거함
        //숫자가 모두 다르면 set.size()는 3
        // 두 개가 같고 1개만 다르면 set.size()는 2
        // 모두 같으면 set.size()는 1
        int score1 = a + b + c;
        int score2 = (a * a) + (b * b) + (c * c);
        int score3 = (a * a * a) + (b * b * b) + (c * c * c);
        
        int result = 0;
        
        if(set.size() == 3){
            result = score1;
        }else if(set.size() == 2){
            result = score1 * score2;
        }else if(set.size() == 1){
            result = score1 * score2 * score3;
        }
        
        return result;        
    }
}