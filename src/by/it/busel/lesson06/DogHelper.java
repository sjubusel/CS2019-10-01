package by.it.busel.lesson06;

public class DogHelper {
    void printAllNames(Dog[] dogsArray) {
        for (Dog x : dogsArray) {
            System.out.print(x.getName() + " ");
        }
        System.out.println();
    }

    double sum = 0.0;

    double averageAge(Dog[] dogsArray) {
        for (Dog x : dogsArray) {
            sum = sum + x.getAge();
        }
        return sum / dogsArray.length;
    }
}
