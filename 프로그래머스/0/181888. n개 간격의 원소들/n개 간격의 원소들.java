class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[(num_list.length + n - 1) / n];
        int index = 0;
        for(int i = 0 ;i < num_list.length;i += n){
            result[index++] = num_list[i];
        }
        return result;
    }
}