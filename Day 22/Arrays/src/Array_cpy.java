

public class Array_cpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int[] {4,5,6,7};
		
		int array[]=new int[4];
	
		for (int i = 0; i<arr.length; i++) {
			array[i]=arr[i];
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.println(array[i]);
		}
	}
	}


