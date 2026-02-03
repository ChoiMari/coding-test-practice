import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d}; //반복문 돌리기 위해 배열에 저장
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for(int die : dice){
            // key : 주사위 눈
            // value : 빈도 수
            map.put(die, map.getOrDefault(die, 0) + 1);
            //getOrDefault() : key로 value값을 찾는데 없으면 기본값 0으로 설정(NPE 방어)
            // 기존에 저장된 key없는 경우 빈도수 1
            // map은 기존키가 있으면 value값을 덮어쓰기 때문에
            // 있을때 마다 +1되어 저장됨
        }
        
        int size = map.size();
        
        if(size == 1){ // 모두 같은 경우
           return 1111 * a;    
        }
        
        int p = 0;
        int q = 0;
        int r = 0;
        
        if(size == 2){ // 3, 1 / 2, 2인 경우
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == 3){ // 3번의 빈도수
                    p = entry.getKey();    
                } else if(entry.getValue() == 1){ // 1번 빈도수
                    q = entry.getKey();
                }
            }
            if(p != 0){ // p값이 세팅되었는지 꼭 확인 필요!(2쌍 2쌍이면 p가 0이니까)
                return (int) Math.pow((10 * p + q), 2);
                // pow() : double타입으로 반환하므로 변환 필요
            }
            
            // 여기 왔다면 2쌍 2쌍인 경우다
            Iterator<Integer> it = map.keySet().iterator();
            //.keySet() : map에서 key묶음 Set으로 반환
            //.itertor() : Set을 처음부터 끝까지 순회할 수 있는 도구 생성
            p = it.next();
            q = it.next(); 
            // Set객체는 순서가 없기 때문에 인덱스 없음
            // 2개 뿐이여서 반복문 필요없음
            // 람다식 또는 향상된 for문 사용도 가능함
            return (p + q) * Math.abs(p - q);
        }
        
        if(size == 3){
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() == 1){
                    list.add(entry.getKey());
                }
            }
            q = list.get(0);
            r = list.get(1);
            return q * r;
        }
        
        int min = dice[0];
        if(size == 4){ //모두 다른 경우          
            for(int die : dice){
                if(min > die){
                    min = die;
                }
            }
        }
        return min;        
    }
}