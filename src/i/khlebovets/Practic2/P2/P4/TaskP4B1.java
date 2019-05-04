package i.khlebovets.Practic2.P2.P4;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskP4B1
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();
        System.out.println("ВВедите рамерз списка");
        int array = sc.nextInt();


        for (int i=0;i<=array-1;i++){
            System.out.println("ВВедите что-нибудь");
            list.add(sc.next());


        }
        System.out.println("размер list "+list.size());
        for (var name : list) {
            System.out.println("|"+name);
        }


    }
}
