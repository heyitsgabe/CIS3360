public class crcheck {

	/*
	 * CRC polynomial: x^15 + x^13 + x^6 + x^4 + x + 1 = 1010000001010011
	 * 
	 * only two parameters can be passed:
	 * 
	 * Parameter 1: "c" or "v" c = calculate || v = verify -if parameter one
	 * isn't the above, print error message and exit
	 * 
	 * Parameter 2: Name of file file needs a be a text file in the same folder
	 * as program if file isn't located in same folder, print error and exit
	 * 
	 * direct all output to terminal
	 * 
	 * program MUST run on Eustis (test server?)
	 * 
	 * source file must be named crcheck.java
	 * 
	 * include README file that contains 
	 * � The compilation command for your program 
	 * � The run command for your program 
	 * � Your statement that the
	 * 	program is entirely your own work and that you have neither developed
	 * 	your code together with any another person, nor copied program code from
	 * 	any other person, nor permitted your code to be copied or otherwise used
	 * 	by any other person, nor have you copied, modified, or otherwise used
	 * 	program code that you have found in any external source, including but
	 * 	not limited to, online sources.
	 */
	
	/*
	 * Main method for the program. All methods can calculations will be
	 * performed in the Calculations class,
	 */
	public static void main(String[] args) {
		
		Calculations calc = new Calculations();

	}

}

class Calculations {
	
	/*
	 * Functions to include:
	 * -read files and input data into array
	 * -XOR functions that takes 32-bit input unsigned binary
	 * 	integers and returns XOR result
	 * -function for CRC calculation
	 * -function for CRC verification
	 * -must run on Eustis
	 * 
	 * Optional functions:
	 * -Regex to trim lines
	 * -read files line by line
	 * -seperate output to write to new lines
	 */
	
	//class variables
	long POLYNOMIAL = 1010000001010011L;
	
	// calculate method
	public void calculate() {
		
	}

	// verify method
	public void verify() {
		
	}
	
	// XOR method
	public void xor() {
		
	}
}
