import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Integer value1 = null;
        Integer value2 = 10;
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        String str="a,b,c";

        List<String> stringList=null;
        List<String> stringList1=new ArrayList<>();
        List<String> stringList2=new ArrayList<>(Arrays.asList(str.split(",")));
        Optional<List<String>> emptyList=Optional.ofNullable(stringList);
        Optional<List<String>> unemptyList=Optional.ofNullable(stringList2);
        List<String> stringList3=emptyList.orElseGet(()->stringList1);
        List<String> stringList4=unemptyList.orElseGet(()->stringList1);
        stringList2.add("a");


        System.out.println("a是不空的：" + a.isPresent());//false
        System.out.println("b是不空的：" + b.isPresent());//true

        System.out.println(b.orElse(getDefaultValue()));
        System.out.println(a.orElse(getDefaultValue()));
        System.out.println(b.orElseGet(() -> getDefaultValue()));
//        System.out.println(a.orElseGet(() -> getDefaultValue()));

        Optional.ofNullable(value2).orElseThrow(IllegalArgumentException::new);

        String lowerString = "hello";
        String upperString = Optional.of(lowerString).map(String::toUpperCase).get();
        System.out.println(upperString);
    }

    public static Integer getDefaultValue() {
        System.out.println("hi");
        return new Integer(0);
    }
}
