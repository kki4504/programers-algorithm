import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MidValue {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{9, -1, 0}));
  }
  static int solution(int[] arr) {
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    Map<Integer, Integer> map = new HashMap<>();
    return arr[arr.length / 2];
  }
}
