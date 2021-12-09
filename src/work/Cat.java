package work;

public abstract class Cat {
    protected String name;
    protected int age;
    protected double price;

    public abstract String toString();

    //public Cat() {}
    public Cat(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
}