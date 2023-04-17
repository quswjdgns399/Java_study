package class_method_study_ex;

public class Multi {
    int a, b;
    String message;

    public Multi(){
        message = "안녕하세요";
    }

    public Multi(int a, int b){
        this.a = a;
        this.b = b;
        message = "매개변수가 2개인 메시지";
        System.out.println("2개의 매개변수가 존재합니다.");
    }

    public Multi(int a, int b, String message){
        this.a = a;
        this.b =b ;
        this.message = message;
        System.out.println("모든 매개변수가 존재합니다.");
    }

    public int calcMulti(){
        return a * b;
    }




}
