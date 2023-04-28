package Ch04_Concert_Rv;
import java.util.*;

class Concert{
    private String S[];
    private String A[];
    private String B[];
    private Scanner sc;
    Concert(){
        sc = new Scanner(System.in);
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for(int i=0; i<10; i++){
            S[i] = "___";
            A[i] = "___";
            B[i] = "___";
        }
    }

    public void allPrint(){
        System.out.print("S >> ");
        Concert.printSeat(S);
        System.out.print("A >> ");
        Concert.printSeat(A);
        System.out.print("B >> ");
        Concert.printSeat(B);
        System.out.println("<<<조회를 완려하였습니다>>>");
    }

    public static void printSeat(String seat[]){
        for(int i=0; i<10; i++){
            System.out.print(" " + seat[i]);
        }
        System.out.println();
    }

    public void delete(String seat[]){
        System.out.print("이름 >> ");
        String name = sc.next();
        for(int i=0; i<10; i++){
            if(name.equals(seat[i])){
                seat[i] = "___";
                System.out.println("취소를 완료했습니다.");
                break;
            }
        }
    }

    public void delete_choiceSeat(){
        while (true){
            System.out.print("S(1), A(2), B(3) >>");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("S >>>");
                    Concert.printSeat(S);
                    delete(S);
                    return;
                case 2:
                    System.out.print("A >>>");
                    Concert.printSeat(A);
                    delete(A);
                    return;
                case 3:
                    System.out.print("B >>>");
                    Concert.printSeat(B);
                    delete(B);
                    return;
                default:
                    System.out.println("다시 입력해주세요.");

            }
        }
    }

    public void reserve(String seat[]){
        System.out.print("이름 >> ");
        String name = sc.next();
        while (true){
            System.out.print("번호 >> ");
            int num = sc.nextInt();
            num--;
            if(seat[num].equals("___")){
                seat[num] = name;
                System.out.println("예약을 완료했습니다.");
                break;
            }
            else
                System.out.println("다른 좌석을 선택해주세요");
        }
    }
    public void resever_choiceSeat(){
        while (true){
            System.out.print("좌석구분 S(1), A(2), B(3) >>");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("S >>>");
                    Concert.printSeat(S);
                    reserve(S);
                    return;
                case 2:
                    System.out.print("A >>>");
                    Concert.printSeat(A);
                    reserve(A);
                    return;
                case 3:
                    System.out.print("B >>>");
                    Concert.printSeat(B);
                    reserve(B);
                    return;
                default:
                    System.out.println("다시 입력해주세요.");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Concert concert = new Concert();
        while (true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    concert.resever_choiceSeat();
                    break;
                case 2:
                    concert.allPrint();
                    break;
                case 3:
                    concert.delete_choiceSeat();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("다시 입력해주세요");
            }
        }
    }
}

