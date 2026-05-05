class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;//유효할 시작인덱스
        int end = arr.length - 1; //유효할 끝 인덱스(0부터 시작하므로 초기값을 -1로 해주는게 맞음)
        for(int i = 0;i < query.length;i++){
            int q = query[i];
            if(i % 2 == 0){
                end = start + q; //뒷부분 줄임
            }else{
                start = start + q;//앞부분 줄임
            }
        }
        
        int[] result = new int[end - start + 1];
        for(int i = 0;i < result.length;i++){
            result[i] = arr[start++];
        }
        return result;
    }
}