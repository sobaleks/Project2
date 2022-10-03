import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
      /*  1. Написать программу для вывода названия поры года по номеру
месяца. При решении используйте оператор switch-case.

      while (true) {
            System.out.println("Введите номер смесяца: ");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого номера месяца не существует");
            }
        }

2.Написать программу для вывода названия поры года по номеру
месяца. При решении используйте оператор if-else-if.

 while (true) {
            System.out.println("Введите номер месяца:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x == 1 || x == 2 || x == 12) {
                System.out.println("Зима");
            } else if (x == 3 || x == 4 || x == 5) {
                System.out.println("Весна");
            } else if (x == 6 || x == 7 || x == 8) {
                System.out.println("Лето");
            } else if (x == 9 || x == 10 || x == 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Такого номера месяца не существует");
            }
        }

3.Напишите программу, которая будет принимать на вход число и на выход будет
выводить сообщение четное число или нет. Для определения четности числа используйте
операцию получения остатка от деления (операция выглядит так: '% 2').

    while (true) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                System.out.println("Число четное");

            } else System.out.println("Число нечетное");

        }

4.Для введенного числа t (температура на улице) вывести:
Если t>–5, то вывести «Тепло». Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».

while (true) {
            System.out.println("Введите температуру");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Тепло ");
            } else if (-5 >= t && t > -20) {
                System.out.println("Нормально ");
            } else {
                System.out.println(" Холодно ");
            }
        }

5.При помощи цикла for вывести на экран нечетные числа от 1 до 99.

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

6.Необходимо вывести на экран числа от 5 до 1.

  for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

7.Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.

  Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int s = 0;
        for (int i = 1; x > i; i++) {
            s = s + i;
        }
        System.out.println(s);

8.Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98.

        int i = 1;
        while (i < 100) {
            i++;
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }



9.Вывести 10 первых чисел последовательности 0, -5,-10,-15.

        for(int i=0;i<50;i++){
            if(i%5==0){
                System.out.print(-i + " ");
            }
        }

        */

        //10. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

        for (double i = 10; i <= 20; i++) {
            System.out.println(Math.pow(i, 2));
        }
    }
}
