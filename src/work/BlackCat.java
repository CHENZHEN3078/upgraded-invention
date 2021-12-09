package work;

public class BlackCat extends Cat {

    public BlackCat(String name, int age) {
        super(name, age, 350);

    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                ", name=" + name +
                ", age=" + age +
                "price=" + price +
                '}';
    }
}