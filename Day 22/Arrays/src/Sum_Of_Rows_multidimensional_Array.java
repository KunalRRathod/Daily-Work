import java.util.Scanner;
public class Sum_Of_Rows_multidimensional_Array {
	public static void sumOfRows(int [] [] mult_array, int rows, int columns) {
		int sum = 0;
		for (int i = 0; i< rows; i++) {
			for(int j = 0; j< columns; j++) {
				sum = sum+ mult_array [i][j];
				
			}
		
		}
		System.out.println(sum);
		
	}
	public static void sumOfColumns(int [] [] mult_array, int rows, int columns) {
		int sum = 0;
		for (int i = 0; i< rows; i++) {
			for(int j = 0; j< columns; j++) {
				sum = sum+ mult_array [j][i];
				
			}
		
		}
		System.out.println(sum);
		
	}
	public static void divideBy3(int [] [] mult_array, int rows, int columns) {
		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					sum = sum + mult_array[i][j];
				}			
			}
		}
		System.out.println("sum of diagonal:" + sum);
	}
	public static void divideBy5(int [] [] mult_array, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (mult_array[i][j] % 3 == 0 && mult_array[i][j] % 5 == 0) {
					System.out.println("elements divisible by 3 and 5 are :" + mult_array[i][j]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns");
		int columns = input.nextInt();
		int mult_array[][] = new int [rows] [columns];
		for (int i = 0; i < rows; i++)
		{
		    for(int j = 0; j < columns; j++) {
		        System.out.println("Row ["+i+"]:  Column "+j+" :");
		    mult_array[i][j] = input.nextInt(); 
		    }
		}
		for (int[] x : mult_array) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println(" ");
		}
		sumOfRows(mult_array, rows, columns);
		sumOfColumns(mult_array, rows, columns);
		divideBy3(mult_array, rows, columns);
		divideBy5(mult_array, rows, columns);
	}
}
	



