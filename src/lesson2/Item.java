package lesson2;

import java.io.*;

public class Item extends ParentItem implements Externalizable {
//    public Item (Item item){
//        this.name = item.name;
//    }

    public Item() {
        super();
    }

     public Item(String name) {
        super(name);
//        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
       }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String) in.readObject();
    }
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return "Item{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
