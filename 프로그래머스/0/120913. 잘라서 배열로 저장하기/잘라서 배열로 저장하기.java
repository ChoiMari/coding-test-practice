class Solution {
    public String[] solution(String my_str, int n) {
        //필요한 배열 크기 계산
        int size = (my_str.length() + n - 1) / n;
        
        // 답을 담을 배열 선언    
        String[] answer = new String[size];
        
        for(int i = 0;i < size;i++){
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            //둘 값을 비교해서 작은 값을 리턴함(문자길이 방지용)
            answer[i] = my_str.substring(start,end);
            //start부터 end직전까지 리턴함
        }
        
        return answer;
    }
}