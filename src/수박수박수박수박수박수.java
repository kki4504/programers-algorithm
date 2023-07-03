import java.util.stream.IntStream;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        System.out.println(solution_K(3));
        System.out.println(solution_J(3));
        System.out.println(solution_M(3));
    }
    public static String solution_K(int n) {
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1, n)
                .forEach(x -> {
                    if (x % 2 == 0)
                        sb.append("박");
                    else
                        sb.append("수");

                });
        return sb.toString();
    }
    public static String solution_J(int n) {

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2==0)
                answer.append("수");
            else
                answer.append("박");
        }
        return answer.toString();
    }
    public static String solution_M(int n) {
        StringBuilder answer = new StringBuilder();

        for(int i =0; i < n; i++)
            answer.append((i % 2 == 0) ? "수" : "박");

        return answer.toString();
    }
}