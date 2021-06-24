package casting;

public class Child extends Parent {

    public void say(){
        System.out.println("tralivali");
    }

    @Override
    public void print() {
        System.out.println("я child");
    }

    @Override
    public String toString() {
        return "trololo";
    }
}
