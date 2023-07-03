package lv1;
// https://school.programmers.co.kr/learn/courses/30/lessons/77884

import java.util.*;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (isOddPrimeSize(i))
                answer -= i;
            else
                answer += i;
        }
        if (left == right) return -1;
        return answer;
    }

    public static boolean isOddPrimeSize(int target) {
        double sqrt = Math.sqrt(target);
        if ((int) sqrt == sqrt) {
            return true;
        }
        return false;
    }

    public static int solution_2(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            int v = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    v++;
                }

            }
            if(v % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
