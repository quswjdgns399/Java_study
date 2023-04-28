package Ch4_prac;
import java.util.*;
public class Dictionary {
    private static String[] kor = {"사랑" , "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "feature", "hope"};
    public static String kor2Eng(String word){
        int i;
        for(i=0; i<kor.length; i++){
            if(word.equals(kor[i]))
                return eng[i];
        }
        return "false";
    }
}

class DicApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어 >> ");
            word = sc.next();
            if(word.equals("그만"))
                break;
            String kor2Eng_result = Dictionary.kor2Eng(word);
            if(kor2Eng_result.equals("false"))
                System.out.println(word + "은(는) 저의 사전에 없습니다.");
            else
                System.out.println(word + "은(는) " + kor2Eng_result);

        }




    }
}
