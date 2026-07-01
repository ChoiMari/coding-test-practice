class Solution {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);
        //마지막으로 등장하는 위치 찾음
        return myString.substring(0,index+pat.length());//끝 인덱스는 포함하지 않음
        
    }
}