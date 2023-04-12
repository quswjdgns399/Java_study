package org.example;


public class Circle
{


    int radius;
    String name;

    public Circle(){}
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);

        Circle donut = new Circle();
        donut.radius = 12;
        donut.name = "크리스피 도넛";
        double donutarea = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + donutarea);

    }
}