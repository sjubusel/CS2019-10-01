package by.it.busel.lesson06;

public class Dog {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        return "Кличка: " + this.getName() + ". Возраст: " + this.getAge();
    }
    private int weight;
    private double power;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    boolean win(Dog otherDog) {
        double chanceThisDog, chanceOtherDog;
        chanceThisDog = 0.2*this.getAge() + 0.3*this.getWeight() + 0.5*this.getPower();
        chanceOtherDog = 0.2*otherDog.getAge() + 0.3*otherDog.getWeight() + 0.5*otherDog.getPower();
        if (chanceThisDog > chanceOtherDog){
            return true;
        } else {
            return false;
        }
    }
}
