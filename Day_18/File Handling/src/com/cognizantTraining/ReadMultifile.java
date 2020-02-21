package com.cognizantTraining;
import java.io.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class ReadMultifile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Define data files
        String path1 = "D:\\data1.txt";
        String path2 = "D:\\data2.txt";
        String path3 = "D:\\data3.txt";
        String path4 = "D:\\data4.txt";

        // Create file input streams
        FileInputStream fin1 = new FileInputStream(path1);
        FileInputStream fin2 = new FileInputStream(path2);
        FileInputStream fin3 = new FileInputStream(path3);
        FileInputStream fin4 = new FileInputStream(path4);

        // Create vectors for mapping
        Vector vector = new Vector();
        vector.add(fin1);
        vector.add(fin2);
        vector.add(fin3);
        vector.add(fin4);
        Enumeration en = vector.elements();

        // Sequence Input
        SequenceInputStream sis = new SequenceInputStream(en);
        int i = 1;
        while ((i = sis.read())!= -1){
            // typecast the integer output to characters
            System.out.println((char)i);
        }


        System.out.println(sis);
    }
}
