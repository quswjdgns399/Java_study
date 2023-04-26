package Ch4_OpenChallenge;

import java.util.Scanner;

public class WordGameApp {

    public static void main(String[] args) {
        WordGameApp game = new WordGameApp();
        game.run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다");
        System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
        int num = sc.nextInt();
        Player[] player = new Player[num];

        for (int i = 0; i < num; i++) {
            player[i] = new Player(); //num만큼 생성
            System.out.print("참가자의 이름을 입력해주세요 >> ");
            player[i].name = sc.next();
        }

        System.out.println(" 시작하는 단어는 아버지 입니다");
        String word = "아버지";

        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);
        char firstChar;


        for (int i = 0; i < num; i++) {
            System.out.print(player[i].name + ">>");
            word = player[i].getWordFromUser();
            firstChar = word.charAt(0); //새로 입력된 word
            player[i].checkSuccess(lastChar, firstChar); //(입력되어있는 word, 새로입력된 word)

            if (i%num == 0) i=0; // 무한루프조건

            lastIndex = word.length() - 1; // 입력되어있는 word 새로정의
            lastChar = word.charAt(lastIndex);
        }


    }
}

