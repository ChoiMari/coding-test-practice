class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            if(!str.contains("ad")){
                sb.append(str + " ");
            }
        }
        return sb.toString().split(" ");
    }
}