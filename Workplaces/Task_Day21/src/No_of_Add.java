import java.util.*;
public class No_of_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = input.nextInt();
		
		
		while(number != 0 ) {
			
                sum += number % 10;
                number /= 10;
                
          
            }       
            
		System.out.print(sum);
		}

}
