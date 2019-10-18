package by.it.busel.lesson06;

/*
+Доработайте класс Dog.

+1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

+2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
++ В классе TaskC1 с клавиатуры через Scanner вводятся две собаки в формате
кличка возраст вес сила
++ кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/


import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName(scanner.next());
        dog1.setAge(scanner.nextInt());
        dog1.setWeight(scanner.nextInt());
        dog1.setPower(scanner.nextDouble());
//        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getWeight() + " "  + dog1.getPower());
        dog2.setName(scanner.next());
        dog2.setAge(scanner.nextInt());
        dog2.setWeight(scanner.nextInt());
        dog2.setPower(scanner.nextDouble());
//        System.out.println(dog2.getName() + " " + dog2.getAge() + " " + dog2.getWeight() + " "  + dog2.getPower());
        if (dog1.win(dog2)){
            System.out.println(dog1.getName());
        } else {
            System.out.println(dog2.getName());
        }
    }

}
