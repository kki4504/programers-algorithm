import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,0,2,7})));
    }
    public static int[] solution(int[] numbers) {
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                } else {
                    numList.add(numbers[i] + numbers[j]);
                }
            }
        }
        numList.sort(Comparator.naturalOrder());

        return numList.stream().distinct().mapToInt(i -> i).toArray();
    }
}
