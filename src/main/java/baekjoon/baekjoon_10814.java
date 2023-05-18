package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (e1, e2)->{
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });

       StringBuilder sb = new StringBuilder();
       for(int i=0; i<num; i++){
           sb.append(arr[i][0]).append(" ");
           sb.append(arr[i][1]).append('\n');
       }

        System.out.println(sb);

    }
}
