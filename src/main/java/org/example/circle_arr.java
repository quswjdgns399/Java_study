package org.example;

public class circle_arr {
    int radius;

    public circle_arr(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public static void main(String[] args){
        circle_arr[] c;
        c = new circle_arr[5];

        for(int i=0; i<c.length; i++){
            c[i] = new circle_arr(i);
        }

        for(int i=0; i<c.length; i++){
            System.out.println(c[i].getArea());
        }
    }
}
