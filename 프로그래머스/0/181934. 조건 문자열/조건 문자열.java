class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // n >= m
        if (ineq.equals(">") && eq.equals("=")) {
            return (n >= m) ? 1 : 0;

        // n > m
        } else if (ineq.equals(">") && eq.equals("!")) {
            return (n > m) ? 1 : 0;

        // n <= m
        } else if (ineq.equals("<") && eq.equals("=")) {
            return (n <= m) ? 1 : 0;

        // n < m
        } else if (ineq.equals("<") && eq.equals("!")) {
            return (n < m) ? 1 : 0;
        }

        // 정의되지 않은 입력 방어
        return 0;
    }
}