package by.it.busel.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19
public class TaskB2 {
    public static void main(String[] args) {
        int[] m = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m.length; i += 1) {
            m[i] = scanner.nextInt();
        }
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < m.length; i++) {
            if (i < (m.length / 2)) {
                a[i] = m[i];
            }
            if (i >= (m.length / 2)) {
                b[i - (m.length / 2)] = m[i];
            }
        }
        System.out.println("a=" + Arrays.toString(a));
        System.out.println("b=" + Arrays.toString(b));
    }

}
