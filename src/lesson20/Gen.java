package lesson20;

public class Gen<T> {
    private T obj;

    public Gen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    public void prinType(){
        System.out.println("Object type:" + obj.getClass().getName());
    }
}
