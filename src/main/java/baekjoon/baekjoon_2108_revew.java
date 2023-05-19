// 최적화 중... 최빈값 알고르즘을 다시 구현해야 할 것 같음.
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class baekjoon_2108_revew {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] sorted_arr = new int[num];

        double sum = 0;
        for(int i=0; i<num; i++){
            arr.add(Integer.parseInt(br.readLine()));
            sum = sum + arr.get(i);
        }

        Collections.sort(arr);

        int avg = (int)Math.round(sum / num);

        int mid = arr.get(num/2);

        int range = arr.get(num-1) - arr.get(0);

        //최빈값 시작
        int rank=0;

        if(num==1) {
            hashMap.put(rank, arr.get(0));
        }
        else {
            for (int i = 0; i < num - 1; i++) {
                for(int j=i+1; j<num; j++){
                    if (Arrays.asList(arr.get(j)).contains(arr.get(i))) {
                        hashMap.put(rank, arr.get(i));
                    }
                    else
                        hashMap.put(rank, arr.get(1));
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
