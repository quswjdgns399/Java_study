package org.example;

public class this_book {
    String title;
    String author;
    void show(){
        System.out.println(title + " " + author);
    }

    public this_book(){
        this("","");
        System.out.println("생성자 호출됨");
    }

    public this_book(String title){
        this(title, "작가미상");
    }

    public this_book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args){
        this_book littleprince = new this_book("어린왕자", "생텍쥐페리");
        this_book lovestory = new this_book("춘향전");
        this_book emptyBook = new this_book();
        lovestory.show();



    }
}
