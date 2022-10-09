import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 2);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число которое необходимо прибавить к элементам массива");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += n;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Сумма всех элементов массива  = " + sum);
// Дополнительное задание
        String[][] array_2 = new String[8][8];
        for (int i = 0; i < array_2.length; i++) {
            for (int j = 0; j < array_2.length; j++) {
                if ((i + j) % 2 == 0) {
                    array_2[i][j] = "W";
                } else
                    array_2[i][j] = "B";
                System.out.print(array_2[i][j] + " ");
            }
            System.out.println();
        }

    }
}