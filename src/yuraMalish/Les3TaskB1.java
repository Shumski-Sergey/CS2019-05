package yuraMalish;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Les3TaskB1 {
    private static double dis(int a, int b, int c){
        double dis = b*b - 4*a*c;
        return  dis;
    }
    public static void main(String[] args) {
        System.out.println("Введите множители квадратного уровнения - a,b,c");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double D=dis(a,b,c);
        if (D>0) System.out.println("Уровнение имеет два корня  " + (-b-Math.sqrt(D))/(2*a) +" и "+ (-b+Math.sqrt(D))/(2*a));
        if (D==0) { System.out.println("Уровнение имеет один корень  " + (-b-Math.sqrt(D))/(2*a)); }
        if (D<0) System.out.println("Дискриминант отрицательный - корней нет");

    }
}
