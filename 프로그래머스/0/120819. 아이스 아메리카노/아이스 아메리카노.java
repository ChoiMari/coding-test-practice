class Solution {
    public int[] solution(int money) {
        final int COFFEE = 5_500;
        int count = money / COFFEE;
        int change = money % COFFEE;
        return new int[]{count, change};
    }
}
/*
        다른 풀이
        final int ICEAMERICANO = 5_500;
        int[] result = new int[2];
        result[0] = money / ICEAMERICANO; // 잔 수
        result[1] = money - (ICEAMERICANO * result[0]);
        // 남은 돈 = 소지금 - (커피값 * 잔수)
        return result;
*/