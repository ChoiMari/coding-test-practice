import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = l;i <= r;i++){
            String str = String.valueOf(i);
            boolean isValid = true;
            for(int j = 0;j < str.length();j++){
                char ch = str.charAt(j);
                if(ch != '0' && ch != '5'){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            return new int[]{-1};
        }
        
        int[] result = new int[list.size()];
        for(int j = 0;j < list.size();j++){
            result[j] = list.get(j);
        }
        
        return result;
    }
}