public class Test_1 {
    public static void main(String[] args) {
        Test_1 method = new Test_1();
        System.out.println(method.solution(718253));
        // n 718253
        // n = n / 10;
        // n 71825
        // n 7182
        // n 718
        // n 71
        // n 7
        // 0
    }
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            sb.append(n % 10);
            n /= 10;
            if (n > 0) {
                sb.append("+");
            }
        }
        sb.append("=").append(sum);
        String answer = sb.toString();
        return answer;
    }
}
