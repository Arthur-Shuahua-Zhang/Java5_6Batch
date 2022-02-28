package day4;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        String dirName = "/Users/shaohua/Desktop/JavaMaterial";
        File file = new File(dirName);
        String[] paths = file.list();
        for (String path: paths) {
            System.out.println(path);
        }

    }
}
