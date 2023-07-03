package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int arr[][] = new int[num][2];

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1,e2)->{
            if(e1[1] == e2[1])
                return e1[0]-e2[0];
            return e1[1]-e2[1];
        });

        int last_time = arr[0][1];
        int count = 1;

        for(int i=1; i<num; i++){
            if(last_time <= arr[i][0]){
                last_time = arr[i][1];
                count++;
            }

        }

        for(int i=0; i<num; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        System.out.println("========================");

        System.out.println(count);
    }
}
