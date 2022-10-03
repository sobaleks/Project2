import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for(int i=1;i<10;i++){

          int   s = 3*i;
            System.out.println("3 *" + i + "=" + s );
        }




        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print("1 ");
            }
            System.out.println();


        }



        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 11; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();


        String answer;
        boolean exit;
        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("Троллейбус"):
                    System.out.println ("Правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println ("Правильный ответ: троллейбус.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }



        for(int i=1; i<10; i++){

            if(i==5){
                System.out.println("Счастливый пельмен под номером 5");
            }

        }

        int a = 0;
        while (a < 10) {
            if (a == 4)
            {
                System.out.println("Вот счастливый пельмень!");
                break;
            }
            a++;
        }

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000;

        }
        System.out.println(population);


        int population = 10000000;
        int born = 14;
        int death = 8;
        for(int i = 1; i <= 10; i++){
            if (born > 7) born -= 1;
            if  (death > 6) death -=1;
            population += population * (born - death) / 1000;
        }
        System.out.println(population);


        System.out.println("Введите сумму вклада :");
        Scanner scanner = new Scanner(System.in);
        float vklad = scanner.nextFloat();
        System.out.println("Введите срок вклада в месяцах");
        int mounth = scanner.nextInt();

        for (int i=0; i <mounth; i++ ){
            vklad += vklad * 7/100;

        }
        System.out.printf("После %d месяце вклад станет равным %f", mounth, vklad);
        scanner.close();

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t ", i * j);
            }
            System.out.println();

        }




        while (true){
            System.out.println(" Введите 2 числа");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println( x*y);
            System.out.println("Надо ли завершить выполение? Если да введите 1");
            int z = scanner.nextInt();
            if(z==1) break;

        }
        Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        .

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        System.out.println("Делителями числа "+x+" являются :");
        for(int i=1; i<=x; i++){
            if(x%i==0){
                System.out.println(i);
            }else
                System.out.println("Введённое число не число");
        }

        Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры

        int a;
        //Переменная, которой будет присваиваться значение факториала заданного числа. Тип переменной long также имеет свои ограничения на размер, что приводит к ошибке если факториал заданного пользователем числа больше максимального размера числа типа long
        long b=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        //Проверка, является ли введенный знак натуральным числом
        if(scn.hasNextInt()){
            //Если проверка пройдена, переменной а присваивается значение введенного числа
            a=scn.nextInt();
            //Так как факториалом является произведение всех чисел до заданного числа с помощью простого цикла получим это значение
            for(int i=a;i>0;i--){
                b*=i;
            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введено не число");


        int a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        //Проверка, является ли введенный знак натуральным числом
        if(scn.hasNextInt()){
            //Если проверка пройдена, перемменой а присваивается значение введенного числа
            a=scn.nextInt();
            //Простое число имеет только 2 делителя - 1 и само себя, Также мы знаем, что все остальные делители могут находится только в промежутке 2-а/а, соответственно если хоть на одно число из этого промежутка заданное число будет делиться без остатка, можно считать - что это число - составное, и прекращать дальнейшую проверку
            for(int i=(int)Math.sqrt(a);i>=1;i--){
                if(a%i==0&i!=1){
                    System.out.println("Заданное число - составное");
                    break;
                }
                if(i==1) System.out.println("Заданное число простое");
            }
        }
        else System.out.println("Ошибка. Введено не число");





        int b=0;
        //С помощью простого цикла и деления по модулю получим значения всех совпадений. Увеличиваем "счетчик" каждый раз, когда сумма первых 3 чисел равна сумме второй тройки. Так как минимальное такое число может быть только после 1000, начинаем цикл с нее
        for(int i=1001;i<1000000;i++){
            int i1=i/100000%10,
                    i2=i/10000%10,
                    i3=i/1000%10,
                    i4=i/100%10,
                    i5=i/10%10,
                    i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                b++;
            }
        }
        System.out.println(b);
        */

        //Создадим переменную, в которую будем заносить количество бракованных табличек
        int b=0;
        //С помощью простого цикла переберем все номера табличек
        for(int i=2;i<=50000;i++){
            //Для того, чтобы найти табличку с цифрой 2 преобразуем номер таблички в String. При помощи метода indexOf проверим наличие в строке символа 2 и если такой символ присутствует - увеличиваем счетчик на единицу
            String s=String.valueOf(i);
            if(s.indexOf('1')!=-1){
                b++;
            }
        }
        System.out.println("Всего бракованных табличек - "+b);

}}
