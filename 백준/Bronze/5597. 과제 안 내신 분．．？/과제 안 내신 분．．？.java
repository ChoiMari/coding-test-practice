import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> students = new HashSet<>();
        int studentsCount = 30; // 전체 학생 수
        int submittedCount = 28; // 제출한 숫자
        for(int i = 1;i <= studentsCount;i++){//30번 반복
            students.add(i); // 1 ~ 30까지의 출석번호 저장
        }
        
        for(int i = 1;i <= submittedCount;i++){ 
            // 제출한 학생 수만큼만 반복
            int n = Integer.parseInt(br.readLine());
            students.remove(Integer.valueOf(n)); //값으로 삭제하기
            //remove 오버로딩
            // 인덱스로 제거, 값으로 제거
            // Integer 타입으로 넣어주어야 값으로 제거가 됨
        }
        
        List<Integer> list = new ArrayList<>(students);
        Collections.sort(list); //오름차순으로 정렬
        // 리턴값 없음. List 원본을 수정함
        
        //안 담아놓고 쓰면 반복할때마다 호출함
        for(int number : list){
            System.out.println(number);    
        }
        br.close();
    }
}