import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        Random ran = new Random();
//        Supplier<Integer> supplier =()->ran.nextInt(1,10);
//        System.out.println(supplier.get());

//        Supplier<Integer> supplier =()->{
//            Random ran = new Random();
//            return ran.nextInt(1,10);
//        };
//

    }

Supplier<Integer> supplier1 = new Supplier<Integer>() {
    @Override
    public Integer get() {
        Random ran = new Random();
        return ran.nextInt(1,10);
    }
};
    sout(supplier.get)




}