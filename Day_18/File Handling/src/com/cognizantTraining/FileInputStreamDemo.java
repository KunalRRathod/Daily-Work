package com.cognizantTraining;
import java.io.*;
import java.nio.Buffer;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String path = "D:\\data.txt";
        String newPath = "D:\\JAVA\\copy.txt";
        File file = new File(path);
        /*
        System.out.println("File Name: " +file.getName());
        System.out.println("File Parent Name: "+file.getParent());
        System.out.println("File Length: "+file.length());
        System.out.println("Input the file");

         */
        FileInputStream in = new FileInputStream(file);
        BufferedInputStream bin = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream(newPath);
        BufferedOutputStream bout = new BufferedOutputStream(out);

        int i ;
        while ((i = in.read())!= -1) {
            out.write(i);
        }
        bout.close();
    }
}