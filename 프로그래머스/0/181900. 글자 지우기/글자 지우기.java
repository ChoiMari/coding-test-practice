class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();//String은 불변타입이라서
        // 누적할 때마다 메모리에 새로 객체를 생성하므로 리소스 절약을 위해 StringBuilder 객체 사용
        
        boolean[] shouldDelete = new boolean[my_string.length()];
        for(int index : indices){
            shouldDelete[index] = true;
        }
        for(int i = 0;i < my_string.length();i++){
            if(!shouldDelete[i]){
                sb.append(my_string.charAt(i));   
            }
        }
        return sb.toString();
    }
}