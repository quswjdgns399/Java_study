package Ch05_prac;


public class extend_Tv {
    private int size;
    public extend_Tv(int size){this.size = size;}
    protected int getSize() {return size;}

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}

class ColorTV extends extend_Tv {
   private int resolution;
   ColorTV(int size, int resolution){
       super(size);
       this.resolution = resolution;
   }
   
   public void printProperty(){
       System.out.println(getSize()+"인치 "+resolution+"컬러");
   }
}

class IPTV extends ColorTV{

    private String ip;
    IPTV(String ip, int size, int resolution){
        super(size, resolution);
        this.ip = ip;
    }

    public void printProperty(){
        System.out.print("나의 IPTV는 "+ip+" 주소의 ");
        super.printProperty();
    }
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();

    }
}

