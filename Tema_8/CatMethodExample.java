package Tema_8;

import java.io.*;

public class CatMethodExample {
    public static void cat(File file) {
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("example.txt");
        cat(file);
    }
}
