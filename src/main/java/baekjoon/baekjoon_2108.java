//시간초과 실패 ㅠㅠ

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class baekjoon_2108 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] arr = new int[num];
        int[] sorted_arr = new int[num];

        double sum = 0;
        for(int i=0; i<num; i++){
            arr[i] = sorted_arr[i] = Integer.parseInt(br.readLine());
            sum = sum + arr[i];
        }

        Arrays.sort(sorted_arr);

        int avg = (int)Math.round(sum / num);

        int mid = sorted_arr[num/2];

        int range = sorted_arr[num-1] - sorted_arr[0];

        //최빈값 시작
        int rank=0;

        if(num==1) {
            hashMap.put(rank, arr[0]);
        }
        else {
            for (int i = 0; i < num - 1; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (Arrays.asList(sorted_arr[j]).contains(sorted_arr[i])) {
                        hashMap.put(rank, sorted_arr[i]);
                    }
                    else
                        hashMap.put(rank, sorted_arr[1]);
                }
            }
        }

        sb.append(avg).append('\n');
        sb.append(mid).append('\n');
        sb.append(hashMap.get(0)).append('\n');
        sb.append(range).append('\n');


        System.out.println(sb);

    }
}
