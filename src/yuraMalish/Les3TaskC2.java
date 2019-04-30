package yuraMalish;

import java.util.Scanner;

public class Les3TaskC2 {
    private static int sum(int n){
        int a, b, c, d, sum;
        a = n/1000;
        b = n/100 - (a*10);
        c = n/10 - (a*100) - (b*10);
        d = n - a*1000 - b*100 - c*10;
        sum= a + b + c + d;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Введите четырех значное число");
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int S = sum(n);
        System.out.println("Сумма цифр вашего числа равна " +  S);
    }
}
