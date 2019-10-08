package by.it.busel.lesson02;

import java.util.Arrays;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + sum);
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("BIN:" + binaryA + "+" + binaryB + "=" + binarySum);
        String hexA = Integer.toHexString(a);
        String hexB = Integer.toHexString(b);
        String hexSum = Integer.toHexString(sum);
        System.out.println("HEX:" + hexA + "+" + hexB + "=" + hexSum);
        String octA = Integer.toOctalString(a);
        String octB = Integer.toOctalString(b);
        String octSum = Integer.toOctalString(sum);
        System.out.println("OCT:" + octA + "+" + octB + "=" + octSum);

    }

}
