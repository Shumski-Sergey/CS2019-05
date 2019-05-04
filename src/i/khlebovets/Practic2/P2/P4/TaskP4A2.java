package i.khlebovets.Practic2.P2.P4;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskP4A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        String input;
        int i=0;

        do {
            System.out.println("ВВедите слово");
            input = sc.next();
            words.add(i,input);
        } while (!input.equals("exit"));
        i++;
    }
}
