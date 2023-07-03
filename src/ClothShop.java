public class ClothShop {
  public static void main(String[] args) {
    System.out.println(solution(150000));
  }
  static int solution(int price) {
    if(price >= 500000) {
      price = (int) (price - price * 0.2);
    }else if(price >= 300000) {
      price = (int) (price - price * 0.1);
    }else if(price >= 100000) {
      price = (int) (price - price * 0.05);
    }
    return price;
  }
}
