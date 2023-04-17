package interface_study_EX;

public class CarEx implements Car{
    public void forward(){
        System.out.println("전진");
    }
    public void back(){
        System.out.println("후진");
    }
    public void stop(){
        System.out.println("정지");
    }

    public static void main(String[] args) {
        Car c = new CarEx();
        c.forward();
        c.back();
        c.stop();

    }

}
