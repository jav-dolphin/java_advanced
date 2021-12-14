package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.get(0);

        Gen gen = new Gen("Hello");
        gen.prinType();
        System.out.println(gen.getObj());
        NoGen noGen = new NoGen("Hello");
        noGen.prinType();
        System.out.println(noGen.getObj());
    }

}
