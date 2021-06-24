package casting;

public class Car {
    private Handle handle;

    private Oil oil;

    public Car(Oil oil){
        //агрегация -> гибкое связывание
        this.oil = oil;


        // композиция -> жесткое связывание
        handle = new Handle();
    }

}
