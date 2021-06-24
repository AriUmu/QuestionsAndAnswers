package casting;

public class CastingTest {

    public static void main(String[] args) {
        Parent[] array = new Parent[2];
        array[0] = new Child();
        array[1] = new Parent();

        Parent child = array[0];
        child.say();

        Parent parent = array[1];

//        if(array[0] instanceof Child){
//            Child child = (Child) array[0];
//            child.say();
//        }

    }
}
