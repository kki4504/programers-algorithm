import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] strings = {"mislav", "stanko", "mislav", "ana"};
        String[] strings1 = {"stanko", "ana", "mislav"};
        System.out.println(solution_K(strings, strings1));
        System.out.println(solution_J(strings, strings1));
        System.out.println(solution_M(strings, strings1));
    }

    public static String solution_K(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant)
            map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : completion)
            map.replace(s, map.get(s) - 1);
        System.out.println(map);
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                answer = key;
            }
        }
        return answer;
    }
    //퍼가요

    public static String solution_J(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
            // par = {a, b, c} com = {a, b}
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length - 1];
    }
    public static String solution_M(String[] participant, String[] completion) {
        String answer = "";
        //completion의 길이는 participant의 길이보다 1 작습니다.== 미완주자 한명
        Arrays.sort(participant);
        Arrays.sort(completion);
        // par = {a, b, c} com = {a, b}

        //
        for(int i = 0; i < completion.length; i++) {
            if(!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            }
            if(i == completion.length-1)
                answer = participant[i+1];
        }

        return answer;
    }
}