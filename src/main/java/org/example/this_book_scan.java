package org.example;

import java.util.Scanner;
public class this_book_scan {
    String title;
    String author;
    public this_book_scan(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("책의 개수를 입력해주세요 >> ");
        int booknum = sc.nextInt();

        this_book_scan book[] = new this_book_scan[booknum];


        for(int i=0; i<booknum; i++){
            System.out.print((i+1) + "번째 책의 제목 >> ");
            String title = sc.next();
            sc.nextLine();
            System.out.print((i+1) + "번째 책의 저자 >> ");
            String author = sc.nextLine();
            book[i] = new this_book_scan(title, author);
        }

        for(int i=0; i<booknum; i++){
            System.out.println((i+1)+ "번째 Book (" + book[i].title + ", " + book[i].author + ")");

            sc.close();
        }
    }
}
