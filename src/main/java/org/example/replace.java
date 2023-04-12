package org.example;
import java.util.Scanner;
public class replace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력해주세요 >> ");
        String str = sc.nextLine();

        String newstr = str.replace(" ", ";");

        System.out.println("변경된 문장 >> " + newstr);

        }



    }

