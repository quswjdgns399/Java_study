package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int [][] arr = new int [num][2];

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1,e2)-> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }
            return e1[1] - e2[1];
        });

        for(int i=0; i<num; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
