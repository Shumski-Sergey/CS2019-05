package yuraMalish;

import java.util.Scanner;

public class Les3TaskA1 {
     public static void main(String[] args) {
         System.out.println("Введите два числа");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println((a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));
         double s, r, p, d, dm;
         s=a+b;
         r=a-b;
         p=a*b;
         d=a/b;
         dm=a%b;
         System.out.println(s+ " "+r+" "+p+" "+d+" "+" "+dm);
    }
}
