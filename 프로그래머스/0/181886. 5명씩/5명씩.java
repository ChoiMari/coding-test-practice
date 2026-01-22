class Solution {
    public String[] solution(String[] names) {
        int n = 5;
        int size = (names.length + (n - 1)) / n;
        int index = 0;
        String[] result = new String[size];
        for(int i = 0;i < names.length;i++){
            if(i == 0 || i % n == 0){
                result[index++] = names[i];
            }
        }
        return result;
    }
}