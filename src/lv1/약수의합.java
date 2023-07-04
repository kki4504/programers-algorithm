package lv1;

public class 약수의합 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(12));
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                answer += i;
                answer += n / i;
            }
        }
        return answer;
    }

    public static int solution_2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                answer += i;
        }
        return answer;
    }
}
