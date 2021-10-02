package Excercises.Ex18;

import java.io.*;
import java.time.LocalDate;

public class JavaBinFileIO {
    public static void main(String[] args) {

//        Person p = new Person("Trung", 28);
//        try {
//            FileOutputStream fos = new FileOutputStream("person.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(p);
//            oos.flush();
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fis = new FileInputStream("person.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

//        //doc file nhi phan
//        try {
//            FileInputStream fis = new FileInputStream("order.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            while (dis.available() > 0) {
//                String name = dis.readUTF();
//                String date = dis.readUTF();
//                double total = dis.readDouble();
//                LocalDate ld = LocalDate.parse(date);
//                Order ord = new Order(ld, name, total);
//                System.out.println(ord);
//            }
//            dis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
    }

//        Order[] orders = new Order[]{
//                new Order(LocalDate.now(), "Trung1", 500f),
//                new Order(LocalDate.now(), "Trung2", 400f),
//                new Order(LocalDate.now(), "Trung3", 300f),
//                new Order(LocalDate.now(), "Trung4", 200f),
//                new Order(LocalDate.now(), "Trung5", 100f),
//        };
//        //Order ord = new Order(LocalDate.now(), "Trung", 500f); //Ghi data vao class Order
//        try {
//            FileOutputStream fos = new FileOutputStream("order.bin");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            DataOutputStream dos = new DataOutputStream(bos);
//            for (Order ord : orders) {
//                dos.writeUTF(ord.getCustomer());
//                dos.writeUTF(ord.getDate().toString());
//                dos.writeDouble(ord.getTotal());
//            }
//            dos.flush();
//            dos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileOutputStream fos = new FileOutputStream("data.bin");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            bos.write("Hello!".getBytes());
//            bos.write("\n".getBytes());
//            bos.write("How are you today?".getBytes());
//            bos.write("\n".getBytes());
//            bos.write(65); //character A
//            bos.flush();
//            bos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileInputStream fis = new FileInputStream("data.bin");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            //read 1 byte
//            int ch;
//            ch = bis.read();
//            while (ch != -1) {
//                System.out.print((char) ch);
//                ch = bis.read();
//            }
//            bis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
}

