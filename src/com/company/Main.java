package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String slovoVSlove = " slovo ";// создал переменную типа String  с любым значением

        final int num = 20; // создал переменную int которая не изменяется (final)
        String word = "word "; // создал переменную типа String word
        System.out.println(word + num + slovoVSlove);//вывел их на экран
        System.out.println(word + num);// вывел на экран только word and num
        if(num < 0){
            System.out.println("Отрицательное число");
        }
        if (num > 0){
            System.out.println("Вы сохранили нуль");
        }
        String name = "Введите ваше имя";
        String hello = "Привет пользователь";
        System.out.println(name);
        System.out.println(hello);
        Scanner scan = new Scanner(System.in);
        String names = scan.next(hello);
        System.out.println(hello + names);
    }
}
