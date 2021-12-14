package lesson20;

public class NoGen {
    private Object obj;

    public NoGen(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
    public void prinType(){
        System.out.println("Object type:" + obj.getClass().getName());
    }
}
