class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        for(int i = 0;i <= myString.length() - pat.length();i++){ 
            //pat이 myString에서 시작할 수 있을 범위까지만 i값 설정
            String partStr = myString.substring(i, i + pat.length());
            if(partStr.equals(pat)){
                count ++;
            }
        }
        return count;
    }
}