package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class baekjoon_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        HashSet<String> user = new HashSet<>();
        user.add("ChongChong");

        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(user.contains(a) || user.contains(b)){
                user.add(a);
                user.add(b);
            }
        }
        br.close();

        System.out.println(user.size());



    }
}
