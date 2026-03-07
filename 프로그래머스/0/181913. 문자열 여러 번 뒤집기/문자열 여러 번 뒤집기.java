class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] chArr = my_string.toCharArray();
        
        for(int i = 0;i < queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            while(s < e){ //같을 땐 바꿀 필요없음
                char temp = chArr[s];
                chArr[s] = chArr[e];
                chArr[e] = temp;
                s++;
                e--;
            }
        }
        return String.valueOf(chArr);
    }
}