import java.util.Scanner;

public class teoria {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int x=5;
        if(x==5){
            System.out.println(x +" равен 5");
        } else{
            System.out.println(x + " не равен 5");
        }*/

        /*  int number =3;
        switch (number){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println(" Совпадений нет");
        } */

/*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);


        int a =0;
        while (a < 10) {

            System.out.println(a++);

       }
        если нужен бесконеный то в скобках пишем слово true */
       /* int i = 0;
        while (i <= 25) {
            System.out.print(i + " ");
            i++;
        } */

       /* for( int i=0; i<=20; i++){
           if( i% 2==0){
            System.out.println(i);}} */

       /* int x=1;
        while (x<10){
            if (x==3){
                break;
            }
            x++;
            System.out.println(x);
        }*/

       /* int x=1;
        while (x<10){
            x++;
            if (x==3){
                continue;
            }

            System.out.println(x);
        }




        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(0.7));
        System.out.println(Math.floor(0.7));
        System.out.println(Math.round(0.7));
        System.out.println(Math.pow(0,2));




        Scanner scanner = new Scanner(System.in);
        int x;

do {


    x = scanner.nextInt();


        }while (x%2 != 0);

        Scanner scanner = new Scanner(System.in);
int a;
while(true){
    a= scanner.nextInt();
    if(a%2==0){
        System.out.println(a);
        break;
    }
}



int x =5;
int y=10;

        y =y +x;
        x=y-x;
        y=y-x;

        System.out.println( "x=" + x);
        System.out.println( "y=" + y);




*/
        System.out.println("Что такое синее с рогами и набитый зайцеми");
Scanner scanner = new Scanner(System.in);
String otvet;
boolean exit = false;

for(int i=1; i <3; i ++) {
    if (exit == true)
        break;
    otvet = scanner.next();
        switch (otvet) {

            case "Троллейбус":
                System.out.println("Ответ правильный");
                exit = true;
break;
            case "Сдаюсь":
                System.out.println("Правильный ответ : Тлоллейбус");
                exit = true;
break;
            default:
                System.out.println("Нет, попробуй ещё раз");
        }
    }




    }
}
