class Solution {
    public int[] solution(int[] num_list, int n) {
        int start = n - 1;
        int end = num_list.length;
        int[] result = new int[end - start];
    
        for(int i = 0;i < result.length;i++){
            result[i] = num_list[start + i];    
        }
        return result;
    }
}