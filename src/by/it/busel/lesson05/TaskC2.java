package by.it.busel.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код 10 9 8 7 6 5 4 3 2 1 11 12 13 14 15 16 17 18 19 20
    public static void main(String[] args) {
        int[] integers = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
//            System.out.print(integers[i] + " ");
        }
        sort(integers);
        for (int i = 0; i < integers.length; i++) {
            int j = integers.length - 1 - i;
            System.out.println(integers[j]);

        }

    }


    public static void sort(int[] array) {
        //Напишите тут ваш код
        int tempint;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    tempint = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tempint;
                }
            }
        }
    }

}
