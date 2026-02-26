class Solution {
    public int solution(int n, int k) {
        int food = 12_000 * n; //양꼬치
        int drink = 2_000 * k; //음료
        int service = 2_000 * (n / 10); //서비스
        
        return food + drink - service;
    }
}