package by.it.mkavalevich.lesson04;

import java.util.Scanner;

    public class TaskB2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x;
            x = sc.nextInt();
            int i=1,n=1;
            while(i<=x) {
                System.out.print(i+" ");
                while(n<=x-1) {
                    n++;
                    System.out.print(i*n+" ");
                }
                i++;
                n=1;
                System.out.println("");
            }
        }
    }



