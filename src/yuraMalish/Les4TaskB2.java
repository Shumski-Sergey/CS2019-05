package yuraMalish;

import java.util.Scanner;

public class Les4TaskB2 {
    public static void main(String[] args) {
        System.out.println("Задайте размер таблицы a на b");
        System.out.println("Введите a ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Введите b ");
        int b=sc.nextInt();
        int i=1;
        int j=1;
        while (i<=a){
            while (j<=b){
                System.out.print(i*j + " ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }


    }
}
