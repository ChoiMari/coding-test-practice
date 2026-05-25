import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<> ();
        for(int i = 0;i < todo_list.length;i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        
        return list.toArray(new String[0]);
        //컬렉션(List, Set 등)을 배열(Array)로 변환하는 메서드
        //<T> T[] toArray(T[] a)
        // 어떤 타입의 배열로 변환할지 아큐먼트로 넣어주어야함
    }
}