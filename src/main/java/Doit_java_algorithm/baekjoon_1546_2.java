package Doit_java_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*틀림ㅠㅠ*/
public class baekjoon_1546_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        long sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum = sum + arr[i];
        }

        long max = 0;
        for(int i=0; i<num; i++){
            if(arr[i] >= max)
                max=arr[i];
        }

        long avg = (long) (sum * 100.0 / max / num);
        System.out.println(avg);

    }
}

