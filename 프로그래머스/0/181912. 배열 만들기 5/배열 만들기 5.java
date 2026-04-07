import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            list.add(Integer.parseInt(str.substring(s, s + l)));
        }
        return list.stream()
            .filter(x -> x > k)
            .mapToInt(x -> x.intValue())
            .toArray();
        
    }
}