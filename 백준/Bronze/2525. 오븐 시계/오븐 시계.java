import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int startHour = sc.nextInt(); //시작 시
        int startMinutes = sc.nextInt(); // 시작 분
        int needMinutes = sc.nextInt(); // 요리에 필요한 시간(분단위)
       
        // 요리 시작 시간을 전체 분으로 환산
        int startTimeMinutes = (startHour * 60) + startMinutes;
        
        //끝나는 시간 계산
        int endCookTotalMinutes = startTimeMinutes + needMinutes;
        if(endCookTotalMinutes >= 1440){
            // 하루는 24 * 60 = 1440분
            endCookTotalMinutes %= 1440;
            // 하루가 몇 번 넘어가든 오늘 시각만 남길 수 있음
            // 나머지가 0~1439로 시계처럼 순환
        }
        int endHour = endCookTotalMinutes / 60;
        int endMinutes = endCookTotalMinutes % 60;
        System.out.printf("%d %d", endHour, endMinutes);
    }
}