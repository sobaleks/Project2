
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double array[] = new double[n];//
        int nol_el = 0; // Переменная для нахождения нулевого элемента в массиве
        int k = 0;
        int z = 0;
        int j = n;
        System.out.println("Для заполнения массива Math.random() введите 1. Для заполнения массива вручную введите 2.");

        switch (scanner.nextInt()) { // выбираем как заполнять массив
            // Заполнение массива через рандом
            case 1:
                // прямой порядок
                for (int i = 0; i < array.length; i++) {
                    array[i] = Math.random();
                    System.out.println(array[i]);
                }
                System.out.println();
                // обратный порядок
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
                System.out.println();
                // Нахождение максимального и минимально элемента и их индексов
                double max = array[0]; // для нахождения максимального элемента
                double min = array[0];//для нахождения минимального элемента
                int index_max = 0;//для нахождения индекса максимального элемента
                int index_min = 0;//для нахождения индекса минимального элемента
                for (int i = 0; i < array.length; i++) {
                    if (max < array[i]) {
                        max = array[i];
                        index_max = i;
                    }
                }
                System.out.println("Максимальный элемент:" + max);
                System.out.println("Индекс максимального элемента: " + index_max);
                System.out.println();
                for (int i = 0; i < array.length; i++) {
                    if (min > array[i]) {
                        min = array[i];
                        index_min = i;
                    }
                }
                System.out.println("Минимальный элемент: " + min);
                System.out.println("Индекс минимального элемента : " + index_min);
                System.out.println();
                // Колличество нулевых элементов
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 0) {
                        nol_el++;
                    }
                }
                if (nol_el != 0) {
                    System.out.println("Колличество нулевых элементов равно : " + nol_el);
                } else
                    System.out.println("Нулевых элементов нет");
                System.out.println();
                //Проверяем является ли массив возрастающим
                for (int i = 1; i < array.length; i++) {
                    if (array[k] > array[i]) {
                        k++;
                        z++;
                    }
                }
                if (z == 0) {
                    System.out.println("Массив является возрастающим");
                } else {
                    System.out.println("Массив не является возрастающим");
                }
                System.out.println();
                // Заменяем элементы массива
                for (int i = 0; i < n / 2; i++) {
                    j--;
                    double c = array[i];
                    array[i] = array[j];
                    array[j] = c;
                }
                System.out.println(Arrays.toString(array));
                break;
            // если нужно вводить числа вручную
            case 2:
                System.out.println("Вводите числа");
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                }
                System.out.println();
                // прямой порядок
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                System.out.println();
                //обратный порядок
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
                //Нахождение максимального и минимально элемента и их индексов
                double max_1 = array[0]; // для нахождения максимального элемента
                double min_1 = array[0];//для нахождения минимального элемента
                int index_max_1 = 0;//для нахождения индекса максимального элемента
                int index_min_1 = 0;//для нахождения индекса минимального элемента
                for (int i = 0; i < array.length; i++) {
                    if (max_1 < array[i]) {
                        max_1 = array[i];
                        index_max_1 = i;
                    }
                }
                System.out.println("Максимальное число:" + max_1);
                System.out.println("Индекс максимального числа: " + index_max_1);
                System.out.println();
                for (int i = 0; i < array.length; i++) {
                    if (min_1 > array[i]) {
                        min_1 = array[i];
                        index_min_1 = i;
                    }
                }
                System.out.println("Минимальный элемент: " + min_1);
                System.out.println("Индекс минимального элемента : " + index_min_1);
                System.out.println();
                //Колличество нулевых элементов
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 0) {
                        nol_el++;
                    }
                }
                if (nol_el != 0) {
                    System.out.println("Колличество нулевых элементов равно : " + nol_el);
                } else
                    System.out.println("Нулевых элементов нет");
                System.out.println();
                //Проверяем является ли массив возрастающим
                for (int i = 1; i < array.length; i++) {
                    if (array[k] > array[i]) {
                        k++;
                        z++;
                    }
                }
                if (z == 0) {
                    System.out.println("Массив является возрастающим");
                } else {
                    System.out.println("Массив не является возрастающим");
                }
                System.out.println();
                //Заполняем элементы массива
                for (int i = 0; i < n / 2; i++) {
                    j--;
                    double c = array[i];
                    array[i] = array[j];
                    array[j] = c;
                }
                System.out.println(Arrays.toString(array));
                break;
            // Если не ввели 1 или 2
            default:
                System.out.println("Неправильно ввели число");
        }
    }
}
