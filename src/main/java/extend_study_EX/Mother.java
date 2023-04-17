package extend_study_EX;

public class Mother {
    private int money;

    public Mother() {
        System.out.println("Mother");
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void show(){
        System.out.println("어머니의 money = " + money);
    }
}
