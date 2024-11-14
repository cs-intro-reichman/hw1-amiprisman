// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // recive given number
		int num = Integer.parseInt(args[0]);
		// find the value in each place 
		int ones = num % 10;
		int tens = ((num - ones)/10)% 10;
		int hundreds = ((num-ones)- (tens * 10))/100;
	System.out.print(hundreds +" hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
