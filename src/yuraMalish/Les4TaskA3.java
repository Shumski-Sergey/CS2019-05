package yuraMalish;

import java.util.Scanner;

public class Les4TaskA3 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==c && a==b && b==c) System.out.println(a +" " + c + " " + b);
        if (a==b &&    a!=c) System.out.println(a + " " + b);
        if (b==c && !(a==b)) System.out.println(b + " " + c);
        if (c==a && !(b==c)) System.out.println(a + " " + c);

    }
}
