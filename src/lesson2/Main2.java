package lesson2;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException, CloneNotSupportedException, ClassNotFoundException {
//        Locale currentLocale = new Locale("de", "DE");
//        ResourceBundle bundle = ResourceBundle.getBundle("MessagesBundle", currentLocale);
//        System.out.println(bundle.getString("hello"));

        Item item = new Item("Boots of Travel");
        Pudge pudge = new Pudge("Pudge", 10, item);

//        Pudge pudgeClone = (Pudge) pudge.clone();

        FileOutputStream out = new FileOutputStream("pudge2.bin");
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(pudge);
//        out.write(baos.toByteArray());


        FileInputStream in = new FileInputStream("pudge2.bin");
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
        ObjectInputStream ois = new ObjectInputStream(in);
        Pudge pudgeClone = (Pudge) ois.readObject();


        pudge.getItem().setName("Aghanim scepter");
        System.out.println("Original: " + pudge);
        System.out.println("Clone:" + pudgeClone);
    }
}