class Solution {
    public int solution(int num1, int num2) {
         // num1을 double로 변환하여 실수 나눗셈 수행
        // 이후 1000을 곱한 뒤 int로 캐스팅하여 소수점 버림
        return (int) ((double) num1 / num2 * 1000);
    }
}