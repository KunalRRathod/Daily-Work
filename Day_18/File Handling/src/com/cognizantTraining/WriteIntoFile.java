package com.cognizantTraining;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import  java.io.IOException;
public class WriteIntoFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path1 ="D:\\data1.txt";
        String path2 ="D:\\data2.txt";
        String path3 ="D:\\data3.txt";
        String path4="D:\\data4.txt";

        FileOutputStream out1 = new FileOutputStream(path1);
        FileOutputStream out2 = new FileOutputStream(path2);
        FileOutputStream out3 = new FileOutputStream(path3);
        FileOutputStream out4 = new FileOutputStream(path4);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        String data = "Run Before You Can Walk ";

        byte[]b = data.getBytes();
        bout.write(b);
        bout.writeTo(out1);
        bout.writeTo(out2);
        bout.writeTo(out3);
        bout.writeTo(out4);
    }
}
