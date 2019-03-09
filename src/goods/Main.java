package goods;


public class Main {

    public static void main(String[] args) {
        Goods goods1 = new Goods();
        Goods goods2 = new Goods("123", "phone", 1200.0);
        Goods goods3 = new Goods("122", "pen", 12.0);
        judgeGood(goods1);
        judgeGood(goods2);
        judgeGood(goods3);
    }

    public static void judgeGood(Goods goods) {
        if (goods.getId().isPresent()) {
            if (goods.getName().get().equals("phone") &&
                    goods.getPrice().get() <= 2000 &&
                    goods.getPrice().get() >= 1000) {
                System.out.println("这就是我要的商品！");
            } else {
                System.out.println("这不是我要的商品o(╥﹏╥)o");
            }
        } else {
            System.out.println("没有商品");
        }

    }

}

