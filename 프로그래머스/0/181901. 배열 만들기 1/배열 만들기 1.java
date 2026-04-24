import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= n;i++){//1 ~ n 이하까지 반복
            if(i % k == 0){ //i가 k의 배수면 나머지 0
                list.add(i); 
            }
        }
        return list.stream()
                .mapToInt(x -> x.intValue())
                .toArray();
    }
}
/*
List 내장 메서드 stream() : 데이터 흐르게 만드는 파이프라인 시작
.mapToInt(Integer::intValue) 각 요소를 하나씩 꺼내서 int로 변환
map 기존 데이터를 변환한 새로운 Stream을 생성한다 (원본 변경 X)
파라미터로 함수형 인터페이스를 받음
x -> x.intValue()
여기서 흐르는 데이터 타입은 Integer(list의 원소)
각 요소에 대해 x.intValue()를 호출하는 함수를 넘긴다.
리턴값은 intStream
toArray() int[]로 묶어서 리턴함

stream은 중간연산(mapToInt)은 실행되지 않고,
toArray() 같은 최종연산에서 한 번에 실행된다 (lazy evaluation)
*/