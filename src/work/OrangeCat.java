package work;

public class OrangeCat extends Cat {
    boolean isFat;

    public OrangeCat(String name, int age, boolean isFat) {

        super(name, age, 200);
        this.isFat = isFat;

    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "name=" + name +
                ", age=" + age +
                ", isfat=" + isFat +
                ", price=" + price +
                '}';
    }
}

