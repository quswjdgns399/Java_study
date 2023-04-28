package Ch4_prac;
import java.util.*;

class Add {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

class Mul {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        char ch = sc.next().charAt(0);


        switch (ch) {
            case '+':
                Add add = new Add();
                add.setValue(a, b);
                result = add.calculate();
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a, b);
                result = sub.calculate();
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a, b);
                result = mul.calculate();
                break;
            case '/':
                Div div = new Div();
                div.setValue(a, b);
                result = div.calculate();
                break;
        }
        System.out.println(result);
        sc.close();
    }
}


