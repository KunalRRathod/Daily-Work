package com;
import java.util.*; 
public class Activity {
    public static int main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lowest range");
        int low_range = input.nextInt();
        System.out.println("Enter Highest range");
        int high_range = input.nextInt();
        int count = 0;
        int tmp ;

        for (low_range = 1; low_range <= high_range; low_range++)
        {
        tmp = low_range;
            while (tmp != 0)
            {
            if (tmp % 10 == 1)
                count ++;
            tmp= 10; // check rest digits
            
            }
    
        }
        return count;
    }
}