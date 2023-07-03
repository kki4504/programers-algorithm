import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열내P와Y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }
    public static boolean solution(String s) {
        List<String> pList = new ArrayList<>(Arrays.asList("p", "P"));
        List<String> yList = new ArrayList<>(Arrays.asList("y", "Y"));
        int cnt = 0;
        String[] split = s.split("");
        for (String s1 : split) {
            if (pList.contains(s1)) {
                cnt ++;
            }
            if (yList.contains(s1)) {
                cnt --;
            }
        }
        return cnt == 0;
    }
}
