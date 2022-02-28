package day4;


import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaNewFeatures {
    public static void main(String[] args) {

      List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
      System.out.println(list.stream().filter(e -> e>3).collect(Collectors.toList()));

    }
}


@FunctionalInterface
interface SayBey {
    void sayBye();

    default public void sayHello() {
        System.out.println("hello");
    }

    default public void sayGM() {
        System.out.println("good morning");
    }
}
