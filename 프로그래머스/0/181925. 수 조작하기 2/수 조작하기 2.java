class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(int i = 0;i < numLog.length - 1;i++){
            n = numLog[i + 1] - numLog[i];
            switch(n){
                case 1 :
                    sb.append("w");
                    break;
                case -1 :
                    sb.append("s");
                    break;
                case 10 :
                    sb.append("d");
                    break;
                case -10 :
                    sb.append("a");
            }
        }
        return sb.toString();
    }
}