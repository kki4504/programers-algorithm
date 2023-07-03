import java.util.Arrays;

public class DuplicateNumbers {
  public static void main(String[] args) {

    System.out.println(solution(new int[]{1,1,2,3,4,5}, 1));
  }
  public static int solution(int[] ints, int n) {
    return (int)Arrays.stream(ints).filter(e -> e == n)
            .count();
  }
}
