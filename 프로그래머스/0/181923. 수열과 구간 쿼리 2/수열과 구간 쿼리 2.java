class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 조건에 만족하는 arr[i] 담을 배열 선언
        int[] result = new int[queries.length];
        
        for(int q = 0;q < queries.length;q++){
            int min = Integer.MAX_VALUE;
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            for(int i = s;i <= e;i++){
                if(arr[i] > k){ //k보다 큰 값 중에서
                    min = Math.min(min, arr[i]);// 둘 중 작은 값을 리턴함
                    //기존 min값과 반복문 돌리는 값 비교해서
                    // 가장 작은 값 찾음
                }
            }
            result[q] = (min == Integer.MAX_VALUE) ? -1 : min;
            //Integer.MAX_VALUE와 같으면 조건에 만족한 값이 없었다는 것
        }
        return result;
    }
}