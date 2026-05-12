class Solution {
    public String[] solution(String[] str_list) {
        int lidx = -1;
        int ridx = -1;
        for(int i = 0;i < str_list.length;i++){
            if(str_list[i].equals("l")){
                lidx = i; //l인덱스 저장
                break; //처음 등장할 때 끝내야 함
            }else if(str_list[i].equals("r")){
                ridx = i;//r인덱스 저장
                break;//처음 등장할 때 끝내야함
            }
        }
        if(lidx > ridx){ //lidx가 먼저 나왔으면
            String[] result = new String[lidx];
            for(int i = 0;i < lidx;i++){
                result[i] = str_list[i];
            }
            return result;
        }else if(ridx > lidx){ //ridx가 먼저 나왔으면
            String[] result = new String[str_list.length - ridx - 1];
            int index = 0;
            for(int i = ridx + 1;i < str_list.length;i++){
                result[index++] = str_list[i]; 
            }
            return result;
        }else{ // 둘 다 없는 경우
            return new String[]{};
        }
    }
}