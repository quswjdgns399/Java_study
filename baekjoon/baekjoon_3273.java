package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int count = 0;
        int l= 0;
        int r= arr.length-1;

        while(l<r){
            if(arr[l]+arr[r]==sum){
                count++;
            }
            if (arr[l]+arr[r]<=sum) {
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println(count);
    }
}
