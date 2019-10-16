package by.it.busel.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        // initialition of an Array, which contains only integer data type
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        // filling of the above-mentioned Array with integers, which have been inputted from the keyboard
        int i, j, a;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        // printing the array "numbers"
        /*for (i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }*/
        // creating of new two variables, which contain the first and last
        int firstnumber = numbers[0];
        int lastnumber = numbers[numbers.length - 1];
        /*System.out.println(firstnumber + " " + lastnumber);*/
        // sorting of the array "numbers" from min value to max value
        for (i = 1; i < numbers.length; i++) {
            for (j = numbers.length - 1; j >= i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    a = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        // printing sorted array "numbers"
        /*for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        int currentIndexOf1stnumber = 0, currentIndexOfLastnumber = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == firstnumber) {
                currentIndexOf1stnumber = i;
                continue;
            }
            if (numbers[i] == lastnumber) {
                currentIndexOfLastnumber = i;
            }
        }
        System.out.println("Index of first element=" + currentIndexOf1stnumber);
        System.out.println("Index of last element=" + currentIndexOfLastnumber);


    }
}
