package p.ovchinko.Lesson2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Les2TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        //https://gist.github.com/sadedv/ee4b5835c0ae609f68e0
        System.out.println("Dec : "+a+" + "+b+" = "+c);
        System.out.println("Bin : " +Integer.toBinaryString(a)+" + "+Integer.toBinaryString(b)+" = "+Integer.toBinaryString(c));
        System.out.println("Hex : " +Integer.toHexString(a)+" + "+Integer.toHexString(b)+" = "+Integer.toHexString(c));
        System.out.println("Okt : " +Integer.toOctalString(a)+" + "+Integer.toOctalString(b)+" = "+Integer.toOctalString(c));
            }
}
