package work;

//接口是这样的吗，感觉写的不对，，，，
public interface CatCafe {
    void BuyCat(String name, int age, String kind);

    void BuyCat(String name, int age, String kind, boolean isFat);

    void Serve(String name, int rua, int month, int day);

    void Close(String month, String day);

}
