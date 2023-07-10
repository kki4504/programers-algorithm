package lv1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution_1("Zbcdefg"));
    }

    public static String solution_1(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
    public static String solution_2(String s) {
        String[] split = s.split("");
        Arrays.sort(split, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) > o2.charAt(0)) return -1;
                else if(o1.charAt(0) < o2.charAt(0)) return 1;
                return 0;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : split) {
            stringBuilder.append(s1);
        }
        return stringBuilder.toString();
    }
}
