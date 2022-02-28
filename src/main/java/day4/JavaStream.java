package day4;

import java.io.*;

public class JavaStream {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("/Users/shaohua/Desktop/JavaMaterial/Java5_6Batch/input.txt");
            out = new FileWriter("/Users/shaohua/Desktop/JavaMaterial/Java5_6Batch/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
                out.write(c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (out != null) out.close();
            if (in != null) in.close();
        }
    }
}
// 你好， 今天是星期五
