class Solution {
    public int solution(int price) {
        return (int) (price - price * calculateDiscountRate(price));
    }

    private double calculateDiscountRate(int price) {
        if (price >= 500_000) return 0.2;
        if (price >= 300_000) return 0.1;
        if (price >= 100_000) return 0.05;
        return 0.0;
    }
    
}