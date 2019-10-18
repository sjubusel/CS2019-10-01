package by.it.busel.lesson06;

public class DogHelper {

    void printAllNames(Dog[] dogs) {
        System.out.print(dogs[0].getName() + " " + dogs[1].getName() + " " + dogs[2].getName() + " "
         + dogs[3].getName() + " " +  dogs[4].getName()+ "\n");
        /*for (Dog x : dogs) {
            System.out.print(x.getName() + " ");
        }
        System.out.println();*/
    }

    double averageAge(Dog[] dogs) {
        double summary = 0.0;
        for (Dog x : dogs) {
            summary += (double) x.getAge();
        }
        return summary / dogs.length;
    }

}
