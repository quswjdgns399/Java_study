package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubble_Buffer {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<num-1; i++){
            for(int j=i+1; j<num; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0; i<num; i++) {
            System.out.println(arr[i]);
        }
    }
}
