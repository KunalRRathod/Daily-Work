import java.util.*;
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stripper, sum = 0, number ;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number");
		number = input.nextInt();
		while (number > 0) {
		stripper = number%10;
		
		sum = sum + stripper;
		number = number1/10;
		
		}
		System.out.print(sum);
	}

}
