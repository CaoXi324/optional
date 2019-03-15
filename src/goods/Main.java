package goods;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Goods goods1 = new Goods();
        Goods goods2 = new Goods("123", "phone", 1200.0);
        Goods goods3 = new Goods("122", "pen", 12.0);

        System.out.println(judgeGood(goods1));
        System.out.println(judgeGood(goods2));
        System.out.println(judgeGood(goods3));
    }

    public static boolean judgeGood(Goods goods) {

        Optional<Goods> optionalGoods = Optional.ofNullable(goods);
        return optionalGoods.filter(item -> item.getName().isPresent())
                .filter(item -> item.getName().get().equals("phone"))
                .filter(item -> item.getPrice().get() <= 2000)
                .filter(item -> item.getPrice().get() >= 1000)
                .isPresent();
    }

}



