package extend_study_EX;

public class Child extends Mother {
    private int age;
    public Child(){
        System.out.println("Child");
    }

    public void setAge(int age){
        this.age = age;
    }

    public void showAge(){
        System.out.println("age = " + age);
        show();
    }
}
