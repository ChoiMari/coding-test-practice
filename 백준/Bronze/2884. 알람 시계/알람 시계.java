import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] clock = str.split("\\s+");
        int hour1 = Integer.parseInt(clock[0]);
        int minute1 = Integer.parseInt(clock[1]);
        
        /*
        유의)
        45분 보다 작은 계산과
        전날로 넘어가지는 경우에서의 계산 주의
        */
        
        // 전체를 분으로 바꿈
        int total = (hour1 * 60) + minute1;
        total -= 45;
        if(total < 0){ //0시 45분 미만인 경우에 해당
            //전날로 넘어가야하기 때문에
            total += (24 * 60);
        }
        
        int hour2 = total / 60;
        int minute2 = total % 60;
        
        System.out.printf("%d %d", hour2, minute2);
        
    }
}