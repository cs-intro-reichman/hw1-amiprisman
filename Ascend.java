// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// ask user for limit
		int limit = Integer.parseInt(args[0]);
		// generate 3 random integers within the range
		int a = (int)(Math.random() * (limit + 1));
		int b = (int)(Math.random() * (limit+1));
		int c = (int)(Math.random() * (limit+1));
// determine ascending order 
	int step1 = Math.min(a,b);
	int min = Math.min(step1,c);
	int step2 = Math.max(a,b);
	int max = Math.max(step2,c);
	int mid = (a + b + c - max - min);
	
	
	
	// print in the orginal order
	System.out.println(a + " " + b + " " + c);
	System.out.println(+ min + " " + mid + " " + max);
	// print in ascending order
	}
}
