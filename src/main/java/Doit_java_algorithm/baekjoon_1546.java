package Doit_java_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] arr = new long[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        for(int i=0; i<num; i++){
            arr[i] = Long.parseLong(st.nextToken());
            sum = sum + arr[i];
        }

        Arrays.sort(arr);
        int max = (int) arr[num-1];
        double avg = sum * 100 / max / num;
        System.out.println(avg);

    }
}

