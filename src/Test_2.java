public class Test_2 {
    public static void main(String[] args) {
        Test_2 method = new Test_2();
        method.solution(9);
    }

    public void solution(int star) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= star; i++) {
            sb.append(" ".repeat(Math.max(0, star - i)));
            sb.append("*".repeat(Math.max(0, 2 * i - 1)));
            if (i != star)
                sb.append("\n");
        }
        System.out.print(sb);
    }
}
