package yuraMalish;

import java.math.BigInteger;
import java.util.Scanner;

public class Les2TaskC2 {
    public static void main(String [] args){
        System.out.println("Введите два целых числа");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int s = a + b;
        System.out.println("DEC: " + a + "+" + b + " = " + (a+b));
        String  abin = Integer.toBinaryString(a);
        String  bbin = Integer.toBinaryString(b);
        String  sbin = Integer.toBinaryString(s);
        System.out.println("BIN: " + abin + "+" + bbin + "=" + sbin);
        String  aoct = Integer.toOctalString(a);
        String  boct = Integer.toOctalString(b);
        String  soct = Integer.toOctalString(s);
        System.out.println("OCT: " + aoct + "+" + boct + "=" + soct);
        String  ahex = Integer.toHexString(a);
        String  bhex = Integer.toHexString(b);
        String  shex = Integer.toHexString(s);
        System.out.println("HEX: " + ahex + "+" + bhex + "=" + shex);

    }
}
