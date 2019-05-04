package i.khlebovets.Practic2.P2.P4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TaskP4C1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();


        System.out.println("Укажите размер массива");
        int z = sc.nextInt();

        //заполнение массива
        for (int i=0;i<z;i++){
            System.out.println("ВВедите что-нибудь");
            list.add(sc.nextInt());
        }
        System.out.println(list.toString());
        //распределение
        for(int i=0;i<z;i++){
            int x= list.get(i);
            if((x%3==0)&&(x%2==0)){
                a.add(x);
                b.add(x);
            }
            else if((x%3)==0){
                a.add(x);
            }
            else if((x%2)==0){
                b.add(x);
            }
            else{
                c.add(x);
            }

        }
        System.out.println("Делятся на 3,a=" +a.toString());
        System.out.println("Делятся на 2, b=" +b.toString());
        System.out.println("Делятся на 3 и 2, c=" +c.toString());

        /* private static void out(){
            ArrayList listCopy = new ArrayList(list);
        }

         */

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println("Сортировка основного массива в обратном порядке=");
        for(int x: list) {
            System.out.print("|"+ x);
        }

    }


}
