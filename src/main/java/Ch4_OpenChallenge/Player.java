package Ch4_OpenChallenge;
import java.util.Scanner;

public class Player{
    String name;
    String getWordFromUser(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        return word;
    }

    public Player(){}

    void checkSuccess(char lastChar, char firstChar){
        if(lastChar != firstChar){
            System.out.println(name + "이 졌습니다.");
            System.exit(0);
        }
    }

}
