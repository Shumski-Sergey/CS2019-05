package yuraMalish;

import java.util.Scanner;

public class Les4TaskA2 {
    public static void main(String[] args){
        System.out.print("Введит порядковый номер дня недели ");
        Scanner den = new Scanner(System.in);
        int d = den.nextInt();
        if (d<1 || d>7) {
            System.out.println("Такого дня недели не существует");
        }
        else
            switch (d){
                case 1:System.out.println("Понедельник");break;
                case 2:System.out.println("Вторник");break;
                case 3:System.out.println("Среда");break;
                case 4:System.out.println("Четверг");break;
                case 5:System.out.println("Пятница");break;
                case 6:System.out.println("Суббота");break;
                case 7:System.out.println("Воскресенье");break;
            }
    }
}
