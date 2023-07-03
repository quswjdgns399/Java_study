package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class baekjoon_20920_HashMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordMap = new HashMap<>();

        for(int i=0; i<num; i++){
            String word = br.readLine();
            if(word.length()<len){
                continue;
            }
            Integer count = wordMap.getOrDefault(word, 0);
            wordMap.put(word, count+1);

        }

        List<String> words = wordMap.keySet().stream().collect(Collectors.toList());
        words.sort((o1, o2) -> {
           int c1=wordMap.get(o1);
           int c2=wordMap.get(o2);

           if(c1==c2){
               if(o1.length() == o2.length()){
                   return o1.compareTo(o2);
               }
               return o2.length()-o1.length();
           }
           return c2-c1;

        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.size(); i++){
            sb.append(words.get(i)).append("\n");
        }
        System.out.println(sb);




    }
}
