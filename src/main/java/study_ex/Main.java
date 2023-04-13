package study_ex;

public class Main {
    public static void main(String[] args) {
        Multi multi1 = new Multi();
        System.out.println(multi1.message);
        System.out.println("---------------------------");

        Multi multi2 = new Multi(1,2);
        int sum1 = multi2.calcMulti();
        System.out.println(sum1);
        System.out.println("----------------------------");


        Multi multi3 = new Multi(2,3,"씨벌");
        int sum2 = multi3.calcMulti();
        System.out.println(sum2);
        System.out.println(multi3.message);
        System.out.println("----------------------------");

        Integer aa = new Integer(10);
        Integer bb = new Integer(10);

        String aaa = new String("안녕");
        String bbb = new String("안녕");

        System.out.println(aa==bb);
        System.out.println("bbb==aaa = " + bbb == aaa);

        System.out.println("bbb==aaa = " + bbb.equals(aaa));
    }
}
