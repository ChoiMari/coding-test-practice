import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int die1 = sc.nextInt(); // 주사위1 
        // nextInt() : 공백(스페이스), 줄바꿈, 탭 단위로 읽음
        int die2 = sc.nextInt();// 주사위2
        int die3 = sc.nextInt();// 주사위3
        
        // 반복문으로 처리하려고 배열에 담음
        int[] dice = {die1, die2, die3};
        
        // 통계/**빈도 수**/로그 분석 -> Map으로
        // key : 주사위 수
        // value : 빈도 수 
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int die : dice){
            map.put(die, map.getOrDefault(die, 0) + 1);
        }
        
        int size = map.size();
        int money = 0;
        if(size == 1){ //모두 같은 눈인 경우
            money = 10_000 + die1 * 1_000;
            System.out.println(money);
            return; //프로그램 종료
        }
        
        if(size == 2){ // 같은 눈 2개
            // 뭐가 같은 눈인지 모르니까 map객체에서 빈도수 꺼내서 확인
            int key = 0;
            for(Map.Entry<Integer, Integer> entry :map.entrySet()){ 
                if(entry.getValue() == 2){// 빈도수가 2이면 저장
                    key = entry.getKey();
                }; 
            }
            money = 1_000 + key * 100;
        }else{ // 모두 다른 눈이 나오는 경우(size == 3)
            int max = dice[0];
            for(int d : dice){
                if(d > max){
                    max = d;
                }
            }
            money = max * 100;
        }
        System.out.println(money);
    }
}