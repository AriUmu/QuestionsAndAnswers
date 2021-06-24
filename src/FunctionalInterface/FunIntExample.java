package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class FunIntExample {

    public static void main(String[] args) {

        Function<Integer, String> convert = x -> x + " долларов";
        Function<Integer, String> convert2 = x -> x + " евро";

        print(convert);
        print(convert2);

        SimpleFunInterface<String> stringSimpleFunInterface = System.out::println;
        printSFI(stringSimpleFunInterface);

        Consumer<String> cons = System.out::println;
        print(cons);

        Predicate<Integer> predicate = x -> x % 2 == 0;

        isEven(predicate, 10);
        isEven(predicate, 11);

        Predicate<Integer> predicate2 = x -> x < 100;
        isEven(predicate2, 99);
        isEven(predicate2, 100);

    }

    public static void print(Function<Integer, String> convert) {
        for (int i = 0; i < 5; i++) {
            System.out.println(convert.apply(i));
        }
    }

    public static void print(Consumer<String> cons) {
        for (int i = 0; i < 5; i++) {
            cons.accept(i + " trololo!!!");
        }
    }

    public static void printSFI(SimpleFunInterface<String> cons) {
        for (int i = 0; i < 5; i++) {
            cons.toDoSomething(i + " trololo!!!");
        }
    }

    public static void isEven(Predicate<Integer> predicate, int x) {
        if (predicate.test(x)) {
            System.out.println("Подходит!");
        } else {
            System.out.println("НЕ подходит");
        }
    }


}
