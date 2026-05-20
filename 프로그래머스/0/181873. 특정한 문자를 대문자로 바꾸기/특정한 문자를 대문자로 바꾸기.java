class Solution {
    public String solution(String my_string, String alp) {
        
        StringBuilder sb = new StringBuilder();
        
        char target = alp.charAt(0);
        
        for(int i = 0;i < my_string.length();i++){
            char ch = my_string.charAt(i);
            if(ch == target){//c원시타입이여서 ==으로 비교 가능
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}