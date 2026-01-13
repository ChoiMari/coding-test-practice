class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        int ab = Integer.parseInt(sb1.append(a).append(b).toString());
        int twoAB = 2 * a * b;
        
        return (ab < twoAB) ? twoAB : ab;
        
    }
}