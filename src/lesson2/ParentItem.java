package lesson2;

import java.io.Serializable;

public class ParentItem {

    protected String name;

    public ParentItem(){
        super();
    }

    public ParentItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ParentItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
