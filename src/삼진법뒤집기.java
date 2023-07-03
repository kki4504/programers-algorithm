import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    private static int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        String[] split = sb.toString().split("");
        for (int i = 0; i < split.length; i++) {
            answer += Integer.parseInt(split[i]) * Math.pow(3, split.length - 1 - i);
            System.out.println("answer" + answer);
        }
        return answer;
    }

}
