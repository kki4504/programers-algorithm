package lv1;
// https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&levels=1&languages=java&page=3

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] ints = set.stream().sorted().mapToInt(Integer::intValue).toArray();
//        int[] ints = set.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }
}
