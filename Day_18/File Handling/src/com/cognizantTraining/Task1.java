package com.cognizantTraining;
import java.io.*;


public class Task1 {
    // counting method
    public static void CountWord(String name) throws FileNotFoundException , IOException{
        int count = 0;
        String saver; // Save string in new variable
        // get file path
        File file = new File("D:\\data.txt");
        FileReader flrdr = new FileReader(file);
        BufferedReader br=new BufferedReader(flrdr);
        // Condition check
        while ((saver = br.readLine()) != null) {
            String[] words = saver.split(" ");
            for (String word : words) {
                if (word.equals(name)) {
                    count++;
                }

            }
            }
            System.out.println(count);
    }
            // Main Method
        public static void main(String [] args) throws IOException {
                String path = "D:\\data.txt"; // File Path
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(reader);
                System.out.println("Enter Name");
                String nme = br.readLine();
                // Method Call
                CountWord(nme);
            }
    }