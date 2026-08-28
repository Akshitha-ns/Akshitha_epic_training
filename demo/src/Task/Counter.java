package Task;

public class Counter {

	public static void main(String[] args) {
		int counter=0;
		for(int i=0;i<5;i++) {
			counter++;
			System.out.println("Increment"+i+":"+counter);
		}
		for(int i=0;i<3;i++) {
			counter--;
			System.out.println("Decrement"+i+":"+counter);
		}
		System.out.println("Final value of counter is: "+counter);
		
	}

}
