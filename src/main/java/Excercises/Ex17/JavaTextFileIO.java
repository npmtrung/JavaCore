package Excercises.Ex17;

import java.io.*;

public class JavaTextFileIO {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("C.txt");

        FileOutputStream fosA = new FileOutputStream("A.txt");
        PrintWriter pwA = new PrintWriter(fosA);
        pwA.println("Example text in file A");
        pwA.close();
        BufferedReader br = new BufferedReader(new FileReader("A.txt"));

        String line = br.readLine();
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        FileOutputStream fosB = new FileOutputStream("B.txt");
        PrintWriter pwB = new PrintWriter(fosB);
        pwB.println("Example text in file B");
        pwB.close();
        br = new BufferedReader(new FileReader("B.txt"));

        line = br.readLine();
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        try (BufferedReader brC = new BufferedReader(new FileReader("C.txt"))) {
            String lineC = null;
            while ((lineC = brC.readLine()) != null) {
                System.out.println(lineC);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
