class Solution {
    public int solution(int angle) {
        int result = 0;
        if(0 < angle && angle < 90){
            result = 1; //예각
        }else if(angle == 90){
            result = 2; //직각
        }else if(90 < angle && angle < 180){
            result = 3;// 둔각
        }else if(angle == 180){
            result = 4; //평각
        }
        return result;
    }
}