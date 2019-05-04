package mkavalevich.lesson04;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a==b) {
            if (a==c)
                System.out.println(a + " " + b + " " + c);
            else
                System.out.println(a +" "+ b);
            }
        else
            if (b==c)
                System.out.println(b +" "+ c);
    }
}

