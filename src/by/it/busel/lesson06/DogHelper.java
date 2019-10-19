package by.it.busel.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogsArray) {
        for (Dog x : dogsArray) {
            System.out.print(x.getName() + " ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogsArray) {
        double sum = 0.0;
        for (Dog x : dogsArray) {
            sum = sum + x.getAge();
        }
        return sum / dogsArray.length;
    }
}
