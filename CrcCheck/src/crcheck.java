import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

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
 * 
 */

public class crcheck {

	// variables
	private static String testText = "TestCase.txt";
	private static String[] textArray;
	private static int POLYNOMIAL_CHECK = 0x0589; //crc calculation for polynomial
	private static Scanner scanner;
	private static List textLines;

	public crcheck() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CRC Check... \n");

		try {
			displayFileText();
			System.out.println("\n");
			textArray();
			System.out.println("\n");
			xor();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void displayFileText() throws IOException {

		InputStream input = new BufferedInputStream(new FileInputStream(testText));

		byte[] buffer = new byte[512];

		try {
			for (int length = 0; (length = input.read(buffer)) != -1;) {
				System.out.write(buffer, 0, length);
			}
		} finally {
			input.close();
		}
	}
	
		
	public static void textArray() throws FileNotFoundException {
		scanner = new Scanner(new File(testText));
		List<String> textLines = new ArrayList<String>();
		
		try {
			while (scanner.hasNextLine()) {
				textLines.add(scanner.nextLine());
			}
		} catch (Exception ex) {
			
		}
		
		textArray = textLines.toArray(new String[0]);
		System.out.println(textArray);
	}
		public static void xor() {
		/*
		 * array1 will be equal to the polynomial used as the divisor
		 * array2 will be used as the dividend
		 * 
		 * array3 will be the dividend with remainder as padding 
		 */
			
			byte[] byteArray = testText.getBytes();
			StringBuilder bin = new StringBuilder();
			
			for (byte b : byteArray) {
				int value = b;
				for (int i = 0; i < 8; i ++) {
				bin.append((value & 128) == 0 ? 0 : 1);
				value <<=1;
				}
				bin.append(' ');
			}
			System.out.println("test case in binary: " + bin);
			
		}
		
		/*
		 * result += Integer.tobinaryString((int)c);
		 * 
		 * String bString = Integer.toBinaryString((int)c);
		 * bResult += ("00000000" + bString).substring(bString.length());
		 * 
		 * this command should pad the end of the lines with 8 0's during the calculation process
		 */
}
