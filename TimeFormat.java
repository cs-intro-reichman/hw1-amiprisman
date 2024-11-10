// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        String m = "";
	    String hr = "";
		String min = "";

		if (minutes<10){
			min = "0" + minutes;
		}  
		else {
			min = "" + minutes;
		}


		if (hours>12){
			hours = hours - 12;
			 m = "PM";
			if (hours<10){
			hr = "0" + hours;
			}}
		else if (hours == 00){
			hr = "12";
			m = "AM";
		}

		 else {
			 m = "AM";
			if (hours<10){
			hr = "0" + hours;
			}}
		
		
		
		
		
		System.out.print(hr + ":" + min + " "+ m);
	}
}