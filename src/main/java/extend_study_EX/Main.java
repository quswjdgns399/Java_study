package extend_study_EX;

public class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.setMoney(10000);
        m.show();
        System.out.println("-------------------------------");

        Child c = new Child();
        c.setMoney(1000);
        c.setAge(20);
        c.showAge();
        System.out.println("-------------------------------");

        Baby b = new Baby();
        b.show();
        System.out.println("-------------------------------");
    }
}
