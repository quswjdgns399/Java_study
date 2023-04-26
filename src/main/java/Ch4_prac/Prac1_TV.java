package Ch4_prac;

public class Prac1_TV {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }

    static class TV{
        private String maker;
        private int season, size;
        TV(String maker, int season, int size){
            this.maker = maker;
            this.season = season;
            this.size = size;
        }

        void show(){
            System.out.println(maker + "에서 만든 " + season +"년형 " + size + "인치 TV");
        }
    }
}
