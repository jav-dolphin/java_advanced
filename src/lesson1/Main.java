package lesson1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //       new lesson1.B();
//        try (FileInputStream in = new FileInputStream("putty.exe");
//             FileOutputStream out = new FileOutputStream("putty_clone.exe");) {
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//            System.out.println("Success.... ");
//        } catch (IOException e) {
//            e.printStackTrace();


//        try (FileReader in = new FileReader("1.txt");
//             FileWriter out = new FileWriter("1_new.txt");) {
//            int c;
//            while ((c = in.read()) != -1) {
//                out.write(c);
//            }
//            System.out.println("Success.... ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader in = new BufferedReader(new FileReader("1.txt"));
//             PrintWriter out = new PrintWriter(new FileWriter("1_new.txt"));) {
//            String line;
//            while ((line = in.readLine()) != null) {
//                out.write(line);
//            }
//            System.out.println("Success.... ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Scanner in = new Scanner(new FileReader("1.txt"));
//        double sum = 0;
////        while (in.hasNext()) {
////            if (in.hasNextDouble()) {
////                String temp = in.next();
////                try {
////                    Integer.parseInt(temp);
////                } catch (Exception e) {
////                    double num = Double.parseDouble(temp);
////                    System.out.println("Number: " + num);
////                }
////            } else {
////                in.next();
////            }
////        }
//        in.useDelimiter("h");
//        while (in.hasNext()) {
//            System.out.println(in.next());
//        }
//        in.close();
//
//        lesson1.Pudge pudge = new lesson1.Pudge("lesson1.Pudge", 13);
//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("pudge.bin"))) {
//            dos.writeUTF(pudge.getName());
//            dos.writeInt(pudge.getLevel());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (DataInputStream dos = new DataInputStream(new FileInputStream("pudge.bin"))) {
            Pudge pudge = new Pudge(dos.readUTF(), dos.readInt());
            System.out.println(pudge);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
