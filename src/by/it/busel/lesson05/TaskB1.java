package by.it.busel.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Привет, ");
        arraylist.add("как твои дела? ");
        arraylist.add("Всё в порядке? ");
        arraylist.add("Что-то беспокоит? ");
        arraylist.add("Вы уверены?");
        int alSize = arraylist.size();
        System.out.println(alSize);
        int i = 0;
        while (i < alSize) {
            System.out.println(arraylist.get(i));
            i++;
        }
    }
}
