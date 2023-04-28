package Ch4_prac;
import java.util.*;

public class Phone {
    private String name;
    private String tel;

    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName(){
        return name;
    }

    public String getTel() {
        return tel;
    }
}

class PhoneBook{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int i;
        Phone phone[];

        System.out.print("인원수 >> ");
        num = sc.nextInt();
        phone = new Phone[num];

        for(i=0; i<num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = sc.next();
            String tel = sc.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
        System.out.println(num + " / " + i);

        while(true) {
            System.out.println("검색할 이름 >> ");
            String names = sc.next();

            for (i = 0; i < num; i++) {
                System.out.println(i);
                if (names.equals(phone[i].getName())) {
                    System.out.println(names + "의 번호는 " + phone[i].getTel() + "입니다." + num + " , " + i);
                    break;
                }
                System.out.println(i+"//");
            }
            System.out.println(num + " / " + i);
            if (i==num) System.out.println(num + " / " + i + names + " 이 없습니다.");
            if (names.equals("그만")) break;
        }
        sc.close();

    }

}