package interface_study_EX;

import java.awt.*;

abstract class Car_ex {
    abstract void run();
}

class forward extends Car_ex{
    void run(){
        System.out.println("전진");
    }
}

class back extends Car_ex{
    void run(){
        System.out.println("후진");
    }
}

class stop extends Car_ex{
    void run(){
        System.out.println("정지");
    }
}

public class Car_abstract{
    public static void main(String[] args) {
        forward forward = new forward();
        back back = new back();
        stop stop = new stop();

        forward.run();
        back.run();
        stop.run();
    }
}