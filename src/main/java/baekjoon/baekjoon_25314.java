package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int a = num / 4;

        for(int i=0; i<a; i++){
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);
    }



}
