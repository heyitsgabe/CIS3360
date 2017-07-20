import java.awt.DisplayMode;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class crcheck {

	/*
	 * CRC polynomial: x^16 + x^10 + x^8 + x^7 + x^3 + 1 = 0x0589
	 *  
	 * only two parameters can be passed:
	 * 
	 * Parameter 1: "c" or "v" c = calculate || v = verify -if parameter one
	 * isn't the above, print error message and exit
	 * 
	 * Parameter 2: Name of file file needs a be a text file in the same folder
	 * as program if file isn't located in same folder, print error and exit
	 * 
	 * source file must be named crcheck.java
	 * 
	 * include README file that contains 
	 * • The compilation command for your program 
	 * • The run command for your program 
	 * • Your statement that the
	 * 	program is entirely your own work and that you have neither developed
	 * 	your code together with any another person, nor copied program code from
	 * 	any other person, nor permitted your code to be copied or otherwise used
	 * 	by any other person, nor have you copied, modified, or otherwise used
	 * 	program code that you have found in any external source, including but
	 * 	not limited to, online sources.
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		displayFiletext();

	}
	
	public static  void displayFiletext() throws IOException{
		
		InputStream input = new BufferedInputStream(new FileInputStream("TestCase.txt"));
		
		byte[] buffer = new byte[8192];
		
		try {
			for (int length = 0; (length = input.read(buffer)) != -1;) {
				System.out.write(buffer, 0, length);
			}
		} finally {
			input.close();
		}
		
}

class Calculations {
	
	// variables
	int POLYNOMIAL_CHECK = 0x0589;
	
	// constructor method
	public Calculations() {	}
	
	// calculate method
	public void calculate() {
		
	}

	// verify method
	public void verify() {
		
		}	
	}
}
