package work;

import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements CatCafe {
    double money;
    double chu;
    ArrayList<String> cat = new ArrayList<>();
    ArrayList<String> customer = new ArrayList<>();
    int i1 = 0, i2 = 0;

    public MyCatCafe(double money) {
        this.money = money;
        this.chu = money;
    }

    @Override
    public void BuyCat(String name, int age, String kind) throws InsufficientBalanceException {
        if (kind.equals("BlackCat") && money < 350 || kind.equals("OrangeCat") && money < 200) {
            throw new InsufficientBalanceException("没钱啦");
        } else {
            if (age<0){age=1;}
            if (kind.equals("BlackCat")) {
                BlackCat a = new BlackCat(name, age);
                cat.add(a.name);
                cat.add("BlackCat");
                i1++;
            }
            if (kind.equals("OrangeCat")) {
                OrangeCat a = new OrangeCat(name, age, false);
                money = money - 200;
                cat.add(a.name);
                cat.add("OrangeCat");
                i2++;
            }
        }

    }

    @Override
    public void BuyCat(String name, int age, String kind, boolean isFat) throws InsufficientBalanceException {
        if (kind.equals("OrangeCat") && money < 200) {
            throw new InsufficientBalanceException("没钱啦");
        } else {
            if (age<0){age=1;}
            if (kind.equals("OrangeCat")) {
                OrangeCat a = new OrangeCat(name, age, isFat);
                money = money - 200;
                cat.add(a.name);
                cat.add("OrangeCat");
                i2++;
            }
        }

    }

    @Override
    public void Serve(String name, int rua, int month, int day) throws CatNotFoundException, DateCheckException {
        if (cat.size() == 0) {
            throw new CatNotFoundException("没猫啊");
        } else {
            if (rua <= 0) {
            } else {
                DateCheck check = new DateCheck();
                check.check(month, day);
                Customer a = new Customer(name, rua, 2021, month, day);
                customer.add("顾客" + a.name);
                String s = "" + a.month;
                String t = "" + a.day;
                customer.add(s);
                customer.add(t);
                for (int i = 1; i <= rua; i++) {
                    Random random = new Random();
                    int num = random.nextInt(cat.size() / 2);
                    System.out.println(a.name + "第" + i + "次rua到了" + cat.get(num * 2 + 1) + " " + cat.get(num * 2));
                }
                System.out.println();
                money = money + 15 * rua;
            }
        }
    }

    @Override
    public void Close(String month, String day) throws DateCheckException {
        DateCheck check = new DateCheck();
        check.check(Integer.parseInt(month), Integer.parseInt(day));
        if (customer.get(1).equals(month) && customer.get(2).equals(day)) {
            System.out.println("今天撸猫赚了 " + (money - chu + i1 * 350 + i2 * 200) + " 元");
            System.out.println("现在猫咖账户上有 " + money + " 元");
            System.out.println("今天的顾客列表 " + customer);
            chu = money;
        } else {
            System.out.println("操作不合规范，猫咖退回到上次歇业后的状态");
            money = chu;
            for (int x = 1; x <= i1 + i2; x++) {
                cat.remove(cat.size() - 1);
                cat.remove(cat.size() - 1);
            }
        }
        customer.clear();
        i1 = 0;
        i2 = 0;
        System.out.println("---------------------------------------------------");
    }
}

