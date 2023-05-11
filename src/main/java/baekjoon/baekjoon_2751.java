package baekjoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_2751 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));*/

       /* Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());*/

        int num = sc.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

       for(int i=0; i<num; i++){
           list.add(sc.nextInt());
       }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);



    }

}
