public class Booth {
    private long id;
    private String name;
    private int total;
    private boolean isClosed;
    public String toString() {
        return "我是编号"+this.id+"的"+this.name+"，我现在有"+this.total+"个西瓜，目前处于："+(this.isClosed?"休业调整":"营业状态");
    }

    public Booth(long id, String name, int total, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
    private static Booth purchase(Booth booth,int buyCount){
        if (booth.isClosed){
            System.out.println("当前摊位处于停业状态");
        }else {
            if (buyCount<booth.getTotal()){
                int count = booth.getTotal()-buyCount;
                System.out.println("成功购买"+buyCount+"个西瓜");
                booth.setTotal(count);
            }else {
                System.out.println("购买失败，该摊位目前只有"+booth.getTotal()+"个西瓜");
            }
        }
        return booth;
    }
    private static int restock(int count){
        if (count > 200){
            System.out.println("单次进货个数不能超过200个");
            return 0;
        }else {
            System.out.println("进货成功");
            return count;
        }
    }
    private static Booth[] closeBooths(Booth[] booths){
        for (Booth booth : booths){
            if (!booth.isClosed()){
                booth.setClosed(true);
            }
            System.out.println(booth.toString());
        }
        return booths;
    }
    public static void main(String []args){
        Booth booth = new Booth(123,"小明",100,false);
        booth=purchase(booth,200);
        booth.setClosed(true);
        booth=purchase(booth,50);
        booth.setClosed(false);
        booth=purchase(booth,50);
        int count = restock(201);
        count=restock(50);
        booth.setTotal(booth.getTotal()+count);
        Booth[] booths =new Booth[2];
        booths[0] = booth;
        booths[1] =new Booth(234,"小强",222,true);
        booths=closeBooths(booths);
    }
}
