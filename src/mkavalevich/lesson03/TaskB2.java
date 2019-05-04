package mkavalevich.lesson03;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double dis;
        double x1, x2;
        dis = b * b - 4 *a * c;
        if (dis > 0){
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println (x1 + " " + x2);
        }
        else if (dis == 0) {
                x1 = -b / (2 * a);
                System.out.println (x1);
        }
        else
            System.out.print("Отрицательный дискриминант");
    }
}
