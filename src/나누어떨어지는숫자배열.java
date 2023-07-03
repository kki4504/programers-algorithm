import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(v -> v % divisor == 0)
                .sorted()
                .toArray();
        if (answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }
}
