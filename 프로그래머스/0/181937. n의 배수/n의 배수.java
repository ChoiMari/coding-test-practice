class Solution {
    public int solution(int num, int n) {
        //num이 n의 배수이면
        if(num % n == 0){
            return  1;
        }else{
            return 0;
        }
    }
}