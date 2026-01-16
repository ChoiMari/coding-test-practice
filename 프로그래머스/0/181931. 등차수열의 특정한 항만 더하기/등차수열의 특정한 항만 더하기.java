class Solution {
    public int solution(int a, int d, boolean[] included) {
        //등차수열 공식
        // an = a1 + (n - 1)d
        int result = 0;
        for(int i = 0; i < included.length;i++){
            if(included[i]){
                result += (a + (i * d));                
            }
        }
        return result;
    }
}