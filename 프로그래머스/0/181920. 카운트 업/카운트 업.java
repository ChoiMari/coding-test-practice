class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = end_num - start_num + 1; 
        int[] result = new int[size];
        int index = 0;
        for(int i = start_num; i <= end_num;i++){
            result[index++] = i;
        }
        return result;
    }
}