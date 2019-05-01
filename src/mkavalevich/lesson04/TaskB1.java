package mkavalevich.lesson04;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if ((x % 4) == 0) {
            if ((x % 100 ) == 0) {
                if ((x % 400) == 0)
                    System.out.println("количество дней в году: 366");
            else
                System.out.println("количество дней в году: 365");
            }
        else
            System.out.println("количество дней в году: 365");
        }
    }
}