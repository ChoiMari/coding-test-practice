import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];
        int last = num_list.length - 1;  // 마지막 원소 인덱스
        int before = num_list.length - 2; // 그 전 원소 인덱스
        
        //기존 값 복사
        for(int i = 0; i < num_list.length ;i++){
            result[i] = num_list[i];
        }
        
        // 추가
        if(num_list[last] > num_list[before]){
            result[result.length - 1] = num_list[last] - num_list[before];
        }else{
            result[result.length - 1] = num_list[last] * 2;
        }
        
        return result;
    }
}