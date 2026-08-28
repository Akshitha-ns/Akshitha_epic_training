package epic_training;

public class Try {

	public static void main(String[] args) {
		int arr[] = new int[4];
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			arr = new int[10];
			System.out.println(arr[5]);
		}
		

	}

}
