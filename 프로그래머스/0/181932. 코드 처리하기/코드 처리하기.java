class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        int length = code.length(); // 반복할 때마다 호출하면 성능에 안좋으니까..
        for(int idx = 0; idx < length ;idx++){
            char ch = code.charAt(idx);
            if(ch == '1'){
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if(mode == 0 && idx % 2 == 0){
                ret.append(ch); // 오버로딩 되어있어서 char타입도 가능
            }
            
            if(mode == 1 && idx % 2 != 0){
                ret.append(ch);
            }
            
        }
        
        return (ret.length() == 0) ? "EMPTY" : ret.toString();
        
    }
}