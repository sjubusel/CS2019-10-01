package by.it.busel.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arlist = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int integer = scanner.nextInt();
            arlist.add(integer);
        }
        ArrayList<Integer> arlistK3 = new ArrayList<>();
        ArrayList<Integer> arlistK2 = new ArrayList<>();
        ArrayList<Integer> arlistKOthers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (arlist.get(i) % 3 == 0) {
                arlistK3.add(arlist.get(i));
            }
            if (arlist.get(i) % 2 == 0){
                arlistK2.add(arlist.get(i));
            }
            if (arlist.get(i) % 3 !=0 && arlist.get(i) % 2 !=0){
                arlistKOthers.add(arlist.get(i));
            }
        }
        printList(arlistK3);
        printList(arlistK2);
        printList(arlistKOthers);
        /*for (int i = 0; i < arlistK3.size(); i++) {
            System.out.print(arlistK3.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arlistK2.size(); i++) {
            System.out.print(arlistK2.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arlistKOthers.size(); i++) {
            System.out.print(arlistKOthers.get(i) + " ");
        }
        System.out.println();*/



        /*for (int i = 0; i < 20; i++) {
            System.out.println(arlist.get(i));
        }*/
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
