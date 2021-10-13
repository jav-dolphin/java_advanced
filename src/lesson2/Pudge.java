package lesson2;

import java.io.*;

public class Pudge implements Serializable {
    private String name;
    private int level;
    private Item item;

    //    public Pudge(Pudge pudge) {
//        this.name = pudge.name;
//        this.level = pudge.level;
//        this.item = new Item(pudge.item);
//    }
    public Pudge(String name, int level, Item item) {
        this.name = name;
        this.level = level;
        this.item = item;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Pudge clonePudge = (Pudge) super.clone();
//        clonePudge.setItem((Item) item.clone());
//        return clonePudge;
//    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Pudge{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", item=" + item +
                '}';
    }

}
