package p.ovchinko.Lesson3;

import java.util.Scanner;

public class TaskB1 {
    private static double dis(int a, int b, int c) {
        double g=a;
        double e=b;
        double f=c;
        double d;
        d=e*e-4*g*f;
        System.out.println("Дискриминант : "+d);
        return d;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 3 числа : ");
        int a=sc.nextInt(); int b=sc.nextInt(); int c=sc.nextInt();
        double d = dis(a,b,c);
        if (d>0){
            double x1, x2;
            x1=(-b-Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Корен х1 : "+x1+" Корен х1 : "+x2);}
        else if (d==0){
        double x;
        x = -b/(2*a);
            System.out.println("Корен х : "+x);
        }
        else
        {
            System.out.println("Уравнение не имеет корней");
        }



    }




}

