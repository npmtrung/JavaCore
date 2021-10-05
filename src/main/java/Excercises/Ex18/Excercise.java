package Excercises.Ex18;

import java.io.*;

public class Excercise {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("originalFile.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Example text".getBytes());
            bos.flush();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("originalFile.bin");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fosCopy = new FileOutputStream("copiedFile.bin");
            BufferedOutputStream bosCopy = new BufferedOutputStream(fosCopy);
            int ch;
            ch = bis.read();
            while (ch != -1) {
                bosCopy.write(ch);
                ch = bis.read();
            }
            bis.close();
            bosCopy.flush();
            bosCopy.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

