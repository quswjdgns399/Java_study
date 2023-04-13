package org.example;

public class overloading {

    public int getSum(int i, int j){
        return i + j;
    }

    public int getSum(int i, int j, int k){
        return i + j + k;
    }

    public double getSum(double i, double j){
        return i + j;
    }

    public static void main(String[] agrs){
        overloading a = new overloading();

        int i = a.getSum(10,12);
        int j = a.getSum(1,2,3);
        double k = a.getSum(1.1, 2.2);

        System.out.printf("%d, %d, %.2f", i, j, k);


    }
}
