class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x",-1);
        int[] result = new int[strArr.length];
        for(int i = 0;i < strArr.length;i++){
            result[i] = strArr[i].length();
        }
        return result;
    }
}