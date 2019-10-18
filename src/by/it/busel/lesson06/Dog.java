package by.it.busel.lesson06;

public class Dog {
    String name;
    int age;

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

    public String toString() {
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        return "Кличка: " + this.getName() + ". Возраст: " + this.getAge();
    }
}
