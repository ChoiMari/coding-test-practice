class Solution {
    public int solution(int n, String control) {
        char[] chars = control.toCharArray();
        for(char ch : chars){
            switch(ch){
                case 'w' : n += 1;
                    break;
                case 's' : n -= 1;
                    break;
                case 'd' : n += 10;
                    break;
                case 'a' : n -= 10;
            }
        }
        return n;
    }
}