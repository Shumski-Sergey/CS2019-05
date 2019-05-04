package yuraMalish;

import java.util.Scanner;

public class Les4TaskB3 {
    public static void main(String[] args) {
        System.out.println("Ввдете число");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int i=1;
        int j=1;
        while (i<s){
            System.out.print(i +",");
            i=i+(j+1);
            j++;
    }



    }

    }

