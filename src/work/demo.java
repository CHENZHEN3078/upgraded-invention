package work;

public class demo {
    public static void main(String[] args) {
        //下面这段用一下toString输出信息，证明我写了toString（虽然没用上，，，，
        OrangeCat cat = new OrangeCat("aa", 1, true);
        System.out.println(cat);
        Customer customer = new Customer("chenzhen", 2, 2021, 12, 1);
        System.out.println(customer);
        System.out.println("--------------------------------------------------");

        //建猫咖
        MyCatCafe cafe = new MyCatCafe(1000);

//BuyCat买入猫猫，Serve招待顾客，Close就是歇业，name名字，rua是rua的次数，kind是猫的种类(只有BlackCat和OrangeCat，类型输错了买不到猫）
        cafe.BuyCat("cc", -3, "BlcakCat");              //若age小于零默认为1
        cafe.BuyCat("dd", 2, "OrangeCat", true);  //使用多态可以选择肥橘猫，不用多态默认橘猫的isFat是false
        cafe.Serve("tom", -1, 12, 2);            //若rua小于等于0就当什么都没发生
        cafe.Serve("jerry", 3, 12, 2);
        cafe.Close("12", "2"); 

//歇业上的时间和招待顾客不是同一天而出现错误（所以每天结束都必须歇业），猫咖状态(钱、猫数量）会还原到前一次歇业
        cafe.BuyCat("ee", 2, "OrangeCat");
        cafe.Serve("JOJO", 2, 12, 3);
        cafe.Serve("DIO", 3, 12, 3);
        cafe.Close("11", "4");

//前面的错误对后面不会有影响
        cafe.BuyCat("ff", 2, "OrangeCat");
        cafe.Serve("limin", 1, 12, 4);
        cafe.Serve("lihua", 2, 12, 4);
        cafe.Close("12", "4");

//如果日期写的有问题（如13月32日），会报错
        cafe.BuyCat("hh", 2, "OrangeCat");
        cafe.Serve("****", 1, 13, 32);
        cafe.Serve("***", 2, 12, 4);
        cafe.Close("12", "4");
    }
}

/*没钱买猫和店里没猫都分别会报错，可以把下面两个例子加到日期报错的前面进行检验
没钱
cafe.buycat("hh", 3, "BlackCat");
cafe.buycat("hh", 3, "BlackCat");
没猫
cafe.cat.clear();
cafe.serve("ww",1,1,1)；
 */

//不知道写得符不符合题意啊，，，有些程序写的方法思路感觉不太好，，，，应该有简洁很多的方法吧，，，，然后一些东西还没理解感觉，，，但应该没bug吧？菜鸟尽力了