package com.cognizantTraining;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
	// write your code here
        String path = "D:\\data.txtdata.txt";
        FileOutputStream out = new FileOutputStream(path, true);
        String msg = " Bring me Thanos !";
        byte b[] = msg.getBytes();
        out.write(b);
        out.close();
    }
}
