package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class baekjoon_25192_Hashset {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        HashSet<String> set = new HashSet<>();
        
        while(num!=0){ /*num-->0는 num--증감식과 num>0 조건식이 합쳐진 조건문이다*/
            String s = br.readLine();

            if(s.equals("ENTER")){
                count = count + set.size();
                set.clear();
                num--;
                continue;
            }
            set.add(s);
            num--;
        }
        System.out.println(count + set.size());


    }
}
