class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int num : num_list){
            if(num % 2 != 0){
                odd.append(num);
                continue;
            }
            even.append(num);
        }
        
        int result = Integer.parseInt(odd.toString()) 
                        + Integer.parseInt(even.toString());
        
        return result;
    }
}
/*
StringBuilder에는 오버로딩된 append() 메서드가 있음.
StringBuilder sb = new StringBuilder();
sb.append(10);        // int
sb.append(3.14);      // double
sb.append(true);      // boolean
sb.append('A');       // char
sb.append("hello");   // String
*/