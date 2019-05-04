package sshumsky.lesson6.model;

public class Dog {
    private int weight;
    private String name;
    private int age;
    private double power;

    public Dog(int weight, String name, int age, double power) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPower() {
        return power;
    }
}
