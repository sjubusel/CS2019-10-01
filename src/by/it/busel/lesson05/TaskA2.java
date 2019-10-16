package by.it.busel.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList arraylist = new ArrayList();
        boolean m = false;
        done:
        while (!m) {
            String s = reader.readLine();
            if (s.equals("END")) {
                m = true;
                break done;
            }
            arraylist.add(s);
        }
        System.out.println(arraylist.toString());

    }
}
