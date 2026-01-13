class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        String abStr = sb1.append(a).append(b).toString();
        //StringBuilder.append() 는 자기 자신을 반환해서 이렇게 체인이 가능함
        String baStr = sb2.append(b).append(a).toString();
            
        int ab = Integer.parseInt(abStr);
        //아규먼트 String타입으로 넣어야함
        int ba = Integer.parseInt(baStr);
        
        return (ab < ba) ? ba : ab;
    }
}