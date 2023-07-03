import java.util.stream.IntStream;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        int count = 4;
        int price = 3;
        int money = 20;
        System.out.println(solution(price, money, count));
    }
    public static long solution(int price, int money, int count) {
        int reduce = IntStream.rangeClosed(1, count).reduce(0, (x, y) -> x + (y * price));
        int result = reduce - money;
        if (result < 0)
            return 0;
        return result;
    }
}
