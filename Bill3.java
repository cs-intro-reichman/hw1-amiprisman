// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// get the names and the total amount paid:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		int total = Integer.parseInt(args[3]);
        //divide total by 3 converting to a double and rounding up
		double each = Math.ceil(total / 3.0); 		
		//return divided value
		System.out.print( "Dear, " + name1 + ", " + name2 + ", and " + name3 + ": pay " + each +" Shekels Each" );
	}
}
