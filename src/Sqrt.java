import java.util.Vector;

public class Sqrt {
  public static void main(String[] args) {
    System.out.println(solution(4));
    System.out.println(solution2(4));
  }
  static int solution(int a) {
    if (Math.sqrt(a) % 1 == 0) {
      return 1;
    }
    return 2;
  }
  static int solution2(int a){
    Vector<Integer> intVec = new Vector<>();
    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        intVec.add(i);
      }
    }
    return intVec.size() % 2 == 1 ? 1 : 2;
  }
}
