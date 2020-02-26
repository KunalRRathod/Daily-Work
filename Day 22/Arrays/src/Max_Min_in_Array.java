
public class Max_Min_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,25,21};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			
			if (arr[i] > max) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Max is "+max);
			for(int i = 0; i<arr.length;i++) {
			 if (arr[i] < min) {
				min = arr[i];
			}
			
			
		}
			System.out.println("Min is "+min);

	}

}
