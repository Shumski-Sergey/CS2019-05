package p.ovchinko.Lesson2;

import java.util.Scanner;

public class Les2TaskC3 {
    private static double getWeight(int a) {
        double m = 3.86;
        double e = 9.86;
        double w = a/e*m;
        w = Math.round(w*100)/100d;
    return w;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ваш вес на Земле : ");
        int a=sc.nextInt();

        System.out.println("Ваш вес на Марсе : "+getWeight(a));
    }
}
