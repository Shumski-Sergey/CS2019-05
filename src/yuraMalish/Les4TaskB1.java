package yuraMalish;

import java.util.Scanner;

public class Les4TaskB1 {
    public static void main(String[] args) {
        String ves = "дней в году 366";
        String neVes = "дней в году 365";
        System.out.println("Введите год ");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        if(g<1600){
            if(g%4==0)System.out.println(ves);
            else System.out.println(neVes);
        }
        else
            if(g%100==0 && g>=1600)
             {
                if (g %4 == 0 && g % 100 == 0 && g%400==0) System.out.println(ves);
                else System.out.println(neVes);
            }
        if (!(g%100==0) && g>=1600){
            if (g%4==0 && !(g%100==0))System.out.println(ves);
            else System.out.println(neVes);
        }

    }

    }
