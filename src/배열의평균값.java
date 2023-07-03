import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 배열의평균값 {
  public static void main(String[] args) {
//    옵셔널연습();
//    System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    System.out.println(짝수홀수갯수(new int[]{1,2,3,4,5}));
    System.out.println(Arrays.toString(solution(new int[]{1,3,5}, 1, 2)));
    System.out.println(Arrays.toString(원소의길이(new String[]{"We", "are", "the", "world!"})));
  }
//  public static double solution(int[] numbers) {
//    IntStream intStream = Arrays.stream(numbers);
//    intStream.range
//    return
//
//  }
  public static int[] solution(int[] numbers, int num1, int num2) {

    return Arrays.copyOfRange(numbers, num1, num1 + num2);
  }
  public static int[] 원소의길이(String[] strlist) {

    return Arrays.stream(strlist).mapToInt(e -> e.length()).toArray();
  }
  public static int[] 짝수홀수갯수(int[] num_list) {
    int[] answer = new int[2];
    for (int value : num_list) {
      if (value % 2 == 0)
        answer[0]++;
      else
        answer[1]++;
    }
    return answer;
  }
  public static int 최댓값만들기(int[] num_list) {
    int[] ints = Arrays.stream(num_list).sorted().toArray();
    return ints[ints.length - 1] * ints[ints.length - 2];
  }


    public static void 옵셔널연습() {
//    int a = Integer.parseInt(null);
    Optional<Integer> optional = Optional.ofNullable(10);
    System.out.println(optional.orElse(1));
  }
}
