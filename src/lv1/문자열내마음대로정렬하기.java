package lv1;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution_2(new String[]{"sun", "bed", "car"}, 1)));
    }

    public static String[] solution(String[] strings, int n) {
        List<String> arr = new ArrayList<>();
        for (String string : strings) {
            arr.add(string.charAt(n) + string);
        }
        arr.sort(Comparator.naturalOrder());
        String[] answer = new String[strings.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i).substring(1);
        }
        return answer;
    }

    public static String[] solution_2(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) return 1;
                else if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                else if (o1.charAt(n) < o2.charAt(n)) return -1;
                else return 0;
            }
        });
        return strings;
    }
}
