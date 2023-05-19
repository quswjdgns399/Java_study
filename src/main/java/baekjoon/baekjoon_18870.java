package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baekjoon_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int[] arr = new int[num];
        int[] arr_1 = new int[num];


        for(int i=0; i<num; i++){
            arr[i] = arr_1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_1);

        int rank = 0;

        for(int i=0; i<num; i++){
            if(!hashMap.containsKey(arr_1[i])){
                hashMap.put(arr_1[i], rank);
                rank++;
            }
        }
        for (int i : arr) {
            sb.append(hashMap.get(i)).append(" ");
        }
        System.out.print(sb);




    }
}
