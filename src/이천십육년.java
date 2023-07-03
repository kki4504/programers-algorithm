import java.time.DayOfWeek;
import java.time.LocalDate;

public class 이천십육년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        DayOfWeek dayOfWeek =  LocalDate.of(2016, a, b).getDayOfWeek();
        System.out.println(dayOfWeek);
        answer = switch (dayOfWeek) {
            case MONDAY -> "MON";
            case TUESDAY -> "TUE";
            case WEDNESDAY -> "WEN";
            case THURSDAY -> "THU";
            case FRIDAY -> "FRI";
            case SATURDAY -> "SAT";
            case SUNDAY -> "SUN";
        };
        return answer;
    }
}
