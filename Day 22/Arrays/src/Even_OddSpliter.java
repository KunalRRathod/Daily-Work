
public class Even_OddSpliter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int []{25,47,42,56,32};
		// check even numbers in array
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 ==0) {
				System.out.print(" Even numbers are: "+array[i]);
			}
			// check odd numbers in array
			for(int i1 = 0;i1 < array.length;i1++) {
				if (array[i1]%2 != 0){
					System.out.print(" Odd numbers are : "+array[i1]);
					}
			}
			
		}
	}

}
