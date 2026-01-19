class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        //int product = 0; 곱셈은 초기값이 0이면 절대안됨
        // 뭘 곱해도 0이 나오니까
        int product = 1;
        for(int num : num_list){
            sum += num;
            product *= num;
        }
        
        return (product < (sum * sum)) ? 1 : 0;
    }
}