package mkavalevich.lesson04;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (x==1) {
            System.out.println("понедельник");
            }
        else if (x==2) {
            System.out.println("вторник");
            }
        else if (x==3) {
            System.out.println("среда");
            }
        else if (x==4) {
            System.out.println("четверг");
            }
        else if (x==5) {
            System.out.println("пятница");
            }
        else if (x==6) {
            System.out.println("суббота");
            }
        else if (x==7) {
            System.out.println("воскресенье");
            }
        else if ((x>7) || (x<1)) {
            System.out.println("такого дня недели не существует");
        }
    }
}
