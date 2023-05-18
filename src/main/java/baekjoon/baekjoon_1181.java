package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() == e2.length()){
                return e1.compareTo(e2);
            }
           return  e1.length()-e2.length();
        });

        sb.append(arr[0]).append('\n');
        for(int i=1; i<num; i++){
            if(!arr[i].equals(arr[i-1])) {
                sb.append(arr[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
