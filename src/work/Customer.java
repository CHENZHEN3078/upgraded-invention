package work;

import java.time.LocalDate;

public class Customer {
    String name;
    int rua, year, month, day;

    public Customer(String name, int rua, int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        this.name = name;
        this.rua = rua;
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", rua=" + rua + ','+" date: " + year + '.' + month + '.' + day +
                '}';
    }
}
