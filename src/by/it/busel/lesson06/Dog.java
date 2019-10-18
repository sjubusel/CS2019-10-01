package by.it.busel.lesson06;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String inputtedName) {
        this.name = inputtedName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int inputtedAge) {
        this.age = inputtedAge;
    }

    @Override
    public String toString() {
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        return "Кличка: " + this.getName() + ". Возраст: " + this.getAge();
    }

/*    public Dog() {

    }

    public Dog(String inputtedName, int inputtedAge) {
        this.name = inputtedName;
        this.age = inputtedAge;
    }*/
}
