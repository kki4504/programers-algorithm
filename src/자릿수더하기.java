public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution_K(987));
        System.out.println(solution_J(987));
        System.out.println(solution_M(987));
    }
    public static int solution_K(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static int solution_J(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
    // 지수님 너무 잘해요 ... 🥺
    // 지수님 퍼갈게요

    public static int solution_M(int n) {
        int answer = 0;
        while( n > 0){
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }

}
