package Ch4_prac;

public class for_ex {
    public static void main(String[] args) {
        int i;
        for(i=0; i<10; i+=2){  //i는 10까지 진행
            System.out.println(i); //i가 10일때 조건이 만족하지 않아 출력X
        }
        System.out.println(i); //사실상 i는 10
    }
}
