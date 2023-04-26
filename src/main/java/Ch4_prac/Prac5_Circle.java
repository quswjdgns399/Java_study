package Ch4_prac;
import java.util.*;
public class Prac5_Circle {

    static class Circle{
        private double x,y;
        private int radius;
        public Circle(double x, double y, int radius){
            this.x=x;
            this.y=y;
            this.radius=radius;
        }

        public Circle() {}

        public int getRadius(){
            return radius;
        }

        public void show(){
            System.out.println("("+x+","+y+")"+radius);
        }

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 개수를 입력해주세요 >> ");
        int num = sc.nextInt();

        Circle[] circles = new Circle[num];

        for(int i=0; i<num; i++){
            System.out.print("x ,y , radius >> ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            circles[i] = new Circle(x,y,radius);
        }

        for(int i=0; i<num; i++){
            circles[i].show();
        }
        sc.close();
    }
}
