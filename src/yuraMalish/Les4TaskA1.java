package yuraMalish;

public class Les4TaskA1 {
    public static void main(String [] args){
        for (int i=1; i<9; i++){
            System.out.println(i + ") " + "Я изучаю программирование");
            if (i==2||i==7) System.out.println(i + ") " + "Меня интересует высокая зарплата");
        }
        System.out.println("\n" + "\t\t" + "Другой вариант кода" + "\n");

                             // таже задача, но др. код

        for (int i=1; i<10; i++){
            if (i==3) System.out.println(i + ") " + "Меня интересует высокая зарплата");
            if (i==8) System.out.println(i + ") " + "Меня интересует высокая зарплата");
            else System.out.println(i + ") " + "Я изучаю программирование");
        }
        System.out.println("\n" + "\t\t" + "Другой вариант кода" + "\n");

                         // таже задача, но др. код

        for (int i=1; i<=10; i++){
            switch (i){
                case 1: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 2: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 3: System.out.println(i + ") " + "Меня интересует высокая зарплата");break;
                case 4: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 5: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 6: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 7: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 8: System.out.println(i + ") " + "Я изучаю программирование");break;
                case 9: System.out.println(i + ") " + "Меня интересует высокая зарплата");break;
                case 10: System.out.println(i+ ") " + "Я изучаю программирование"); break;
            }
        }


    }

}
