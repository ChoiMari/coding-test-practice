import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        //int[] 몇 칸이 필요한지 모르기 때문에 list 사용
        list.add(n);
        
        for( ; n != 1;){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (3 * n) + 1;
            }
            list.add(n);
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}