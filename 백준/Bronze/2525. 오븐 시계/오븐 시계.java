import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] startTimeStr = sc.nextLine().split("\\s+"); //시작 시간 분
        int cookTimeMinutes = sc.nextInt(); // 요리에 필요한 소요시간
        
        int startHour = Integer.parseInt(startTimeStr[0]); // 시(정수변환)
        int startMinutes = Integer.parseInt(startTimeStr[1]);// 분(정수변환)
        
        // 시작시간을 분으로 환산
        int startTimeMinutes = (startHour * 60) + startMinutes;
        
        //끝나는 시간 계산
        int endCookTotalMinutes = startTimeMinutes + cookTimeMinutes;
        if(endCookTotalMinutes >= (24 * 60)){
            endCookTotalMinutes -= (24 * 60); 
        }
        int endHour = endCookTotalMinutes / 60;
        int endMinutes = endCookTotalMinutes % 60;
        System.out.printf("%d %d", endHour, endMinutes);
    }
}