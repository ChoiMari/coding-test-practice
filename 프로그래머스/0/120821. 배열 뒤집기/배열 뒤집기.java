class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length - 1;
        int[] result = new int[num_list.length];
        
        for(int i = 0;i < num_list.length;i++){
            result[i] = num_list[n--];
    
        }
        return result;
    }
}