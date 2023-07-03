import java.util.Arrays;

public class 홀수구하기 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(ints).average().getAsDouble());
    }
}
