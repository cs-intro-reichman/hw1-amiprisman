// Computes the future value of a saving investment.

public class FVCalc {

    public static void main(String[] args) {
        //recieve information from user 
        int current = Integer.parseInt(args[0]);
        double intrest = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        // calculate future value
        double rate = intrest / 100;

        double step = 1 + rate;
        double temp = Math.pow(step, years);
        double fv = temp * current;

        // print out and display nicely 
        System.out.print("After " + years + " years, ");
        System.out.print("$");
        System.out.print((int) current);
        System.out.print(" saved at %");
        System.out.print(intrest);
        System.out.print(" will yeild $");
        System.out.print((int) fv);

    }
}
