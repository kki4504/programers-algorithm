public class IceAmericano {
  public static void main(String[] args) {

  }
  int[] solution(int money) {
    final int AMERICANO = 5500;
    int count = money / AMERICANO;
    money -= count * AMERICANO;
//    int[] ints = new int[2]{1, 2};
    return new int[]{count, money};
  }
}
