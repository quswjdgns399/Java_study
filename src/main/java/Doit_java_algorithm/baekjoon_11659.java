package Doit_java_algorithm;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[M];
        long sum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum = sum + arr[i];
            arr[i] = sum;
        }

        for(int i=0; i<N;i++){

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==1)
                System.out.println(arr[b-1]);
            else if (a!=1)
                System.out.println(arr[b-1]-arr[a-2]);
            else if (a==b)
                System.out.println(arr[a-1]);


        }




    }
}
