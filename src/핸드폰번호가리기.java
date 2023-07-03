public class 핸드폰번호가리기 {
    public static void main(String[] args) {


        String result = "";
        String s = "01033334444";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 4; i++) {
            result += "*";
        }
        result +=  s.substring(s.length() - 4);
//        System.out.println(String.valueOf());
        System.out.println(result);
    }
}
