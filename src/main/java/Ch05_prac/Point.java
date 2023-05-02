package Ch05_prac;

class Point{
    private int x,y;
    public Point(int x, int y){this.x = x; this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x, int y){this.x=x; this.y=y;}
}

class ColorPoint extends Point{

    String color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color=color;
    }
    public void setXY(int x, int y){
        move(x,y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String tmp = color+"색의 "+ "(" + getX() + "," + getY() + ")의 점";
        return tmp;
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setXY(10,20);
        cp.setColor("red");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}

class ColorPoint2 extends Point{
    private String color;
    ColorPoint2(){super(0,0); this.color = "BLACK";}
    public ColorPoint2(int x, int y){
        super(x,y);
        this.color = "BLACK";
    }
    public void setXY(int x, int y){
        move(x,y);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String tmp = color + "색의 (" + getX() + "," + getY() + ")점";
        return tmp;
    }

    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint2 cp = new ColorPoint2(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}

class Point3D extends Point{
    int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public void moveUp(){
        z++;
    }
    public void moveDown(){
        z--;
    }
    public void move(int x, int y, int z){
        move(x,y);
        this.z = z;

    }
    public String toString(){
        String tmp = "("+getX()+","+getY()+","+z+") 의 점";
        return tmp;
    }
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString());

        p.moveUp(); //z위로 이동
        System.out.println(p.toString());
        p.moveDown(); // z아래로 이동
        p.move(10,10); //x, y 이동
        System.out.println(p.toString() + "입니다.");

        p.move(100,200,300);
        System.out.println(p.toString() + "입니다.");
    }
}