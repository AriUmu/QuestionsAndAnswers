package nested_class;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        //Person.Address address = new Person());// ferhuwy342efas -> []

//        new Person("", "Spb, Nalichnay, 12");
//
//
//        Boeing737.Drawing drawing = new Boeing737.Drawing();


        todosomething(x -> "trololo");

    }

    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("");
        }
    }

    public static void todosomething(Function<String, String> function){
        for (int i = 0; i < 10; i++) {
           // function.apply();
        }
    }
}
