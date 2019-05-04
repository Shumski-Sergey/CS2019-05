package p.ovchinko.Lesson3;

import java.util.Scanner;

public class TaskC1 {
    private static double convertCelsiumToFahrenheit (int c) {
       double f = 9/5*c+32;
       return f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Температура?");
        int a=sc.nextInt();
        System.out.println("По фаренгейту : "+convertCelsiumToFahrenheit(a));
    }
}
