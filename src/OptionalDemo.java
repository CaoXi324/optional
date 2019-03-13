import java.util.Optional;

public class OptionalDemo {
    static String b() {
        System.out.println("B");
        return "B";
    }
    static String a() {
        System.out.println("A");
        return "A";
    }
    public static void main(String[] args) {
        //    创建Optional对象的三种方式
        Optional<String> empty = Optional.empty();

        String name = "Alex";
        Optional<String> optA = Optional.of(name);

        String gender = "female";
        Optional<String> optB = Optional.ofNullable(gender);


//      判断是否为空
//        System.out.println(optA.isPresent());//true
////        System.out.println(optB.isEmpty());
//        System.out.println(empty.isPresent());//false
//
////        ifPresent() 方法里面接受一个lambda表达式，表示当对象存在时需要执行的操作。
//        optA.ifPresent(value -> System.out.println(value));//Alex
//
//
//        System.out.println(optA.orElse("a"));//Alex
//        System.out.println(empty.orElse("a"));//a
        String nullName = null;
        String name2 = Optional.ofNullable(nullName).orElseGet(() -> b());//用Optional.of()会报错
        String name3 = empty.orElse( "1");
        String name4 = optA.orElse(a());
        String name5 = optB.orElseGet(()->b());
        Optional name6 = Optional.ofNullable(optB).orElseGet(()-> Optional.ofNullable(b()));
        System.out.println(name2);//
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

//        orElseThrow() 方法表示当Optional里面的值为空的时候，抛出一个异常
        String name7 = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);

//        get()方法表示当Optional的对象不为空的时候，返回Optional对象里面的内容。
        System.out.println(optB.get());//female

    }
}