public class Test_3 {
    public static void main(String[] args) {
        Test_3 method = new Test_3();
        int[][] arr1 = {{0,0,0,0,1},
                        {0,1,0,1,1},
                        {1,1,1,1,0},
                        {1,0,0,1,0},
                        {1,1,1,1,0}};
        method.solution(arr1);
    }
    public void solution(int[][] arr1) {
        StringBuilder sb = new StringBuilder();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int big = arr1[i][j];
                boolean duplicateCheck = false;

                for (int k = 0; k < 4; k++) {
                    int nx = j + dx[k];
                    int ny = i + dy[k];

                    if (nx < 0 || ny < 0 || nx >= arr1.length || ny >= arr1.length)
                        continue;
                    if (big < arr1[ny][nx])
                        big = arr1[ny][nx];
                    if (big == arr1[i][j] && big == arr1[ny][nx])
                        duplicateCheck = true;
                }
                if (big == arr1[i][j] && !duplicateCheck) {
                    sb.append("*");
                } else {
                    sb.append(arr1[i][j]);
                }
                if (j != arr1[0].length - 1)
                    sb.append(" ");
            }
            if (i != arr1.length - 1)
                sb.append("\n");
        }
        System.out.print(sb);
    }
}
