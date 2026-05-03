import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int start = -1; //2가 처음 등장하는 인덱스
        int end = -1; //2가 가장 마지막에 등장하는 인덱스
        
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        
        if(start == -1){ //arr에 2가 없는 경우
            return new int[]{-1};
        }
        
        return Arrays.copyOfRange(arr, start, end + 1);
        //Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스)
        // 끝인덱스는 직전(-1)까지 복사
    }
}