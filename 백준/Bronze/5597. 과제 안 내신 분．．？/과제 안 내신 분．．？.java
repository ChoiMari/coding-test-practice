import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //제출 여부를 저장할 배열 선언(출석번호 1 ~ 30번)
        //배열 0번째는 안씀
        boolean[] submitted  = new boolean[31];
        int submitStudetnsNumber = 28; //제출한 학생 수 
        for(int i = 1; i <= submitStudetnsNumber;i++){ //28번 반복
            int number = Integer.parseInt(br.readLine());
            // 제출한 출석번호에 해당하는 인덱스는 true저장
            submitted[number] = true;
        }
        
        for(int i = 1 ;i < submitted.length;i++){ // 30번 반복
            if(!submitted[i]){
                System.out.println(i);
            }
        }
        br.close();
    }
}