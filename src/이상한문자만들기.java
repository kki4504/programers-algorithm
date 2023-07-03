import java.util.Arrays;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution_K("try hello world   "));
        System.out.println(solution_J("try hello world   "));
        System.out.println(solution_M("try hello world   "));
    }
    public static String solution_K(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");
        int cnt = 0;
        for (String s1 : split) {
            if (s1.equals(" ")) {
                cnt = 0;
                sb.append(s1);
                continue;
            }
            if (cnt % 2 == 0) {
                sb.append(s1.toUpperCase());
            } else {
                sb.append(s1.toLowerCase());
            }
            cnt ++;
        }
        return sb.toString();
    }
    public static String solution_J(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }
        return answer;
    }
    public static String solution_M(String s) {
        String answer = "";
        //공백으로 배열만들기
        String[] strArr = s.split(" ");
        //단어의 인덱스 배열 만들기
        for(String is : strArr){
            String[] as = is.split("");
            for(int i = 0; i < as.length; i ++){
                answer += (i % 2 == 0) ? as[i].toUpperCase() : as[i].toLowerCase();
                if( is == strArr[strArr.length-1]) {
                    continue;
                }
                else{
                    if( i == as.length-1)
                        answer += " ";
                }
            }
        }
        return answer ;
    }
}

