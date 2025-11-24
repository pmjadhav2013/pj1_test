package prashant;

	import java.util.Scanner;

	public class DecimalToBaseConverter {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        long decimalNumber = scanner.nextLong();

	        System.out.print("Enter the target base (2-36): ");
	        int targetBase = scanner.nextInt();

	        if (targetBase < 2 || targetBase > 36) {
	            System.out.println("Invalid base. Please enter a base between 2 and 36.");
	        } else {
	            String convertedNumber = convertDecimalToBase(decimalNumber, targetBase);
	            System.out.println("Decimal " + decimalNumber + " in base " + targetBase + " is: " + convertedNumber);
	        }

	        scanner.close();
	    }

	    /**
	     * Converts a decimal number to its string representation in a specified base.
	     *
	     * @param decimalNumber The decimal number to convert.
	     * @param targetBase    The target base (radix) for the conversion (2-36).
	     * @return The string representation of the decimal number in the target base.
	     */
	    public static String convertDecimalToBase(long decimalNumber, int targetBase) {
	        // Handle negative numbers for consistency with Integer/Long.toString behavior
	        if (decimalNumber < 0) {
	            return "-" + Long.toString(Math.abs(decimalNumber), targetBase);
	        } else {
	            return Long.toString(decimalNumber, targetBase);
	        }
	    }
	    
	   
	}

