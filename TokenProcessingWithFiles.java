import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Name: <your name here>
 *
 * CS 121
 *
 * Core Topics: Checked Exceptions(FileNotFoundException), File Object, Scanner methods that can read tokens
 * in a file: nextInt() nextDouble() and next()
 */

public class TokenProcessingWithFiles {

	public static void main(String[] args) throws FileNotFoundException {
		// your program's working directory - where is your program going to look
		// for the file automatically without a relative or absolute path
		System.out.println(System.getProperty("user.dir"));
		
		//Scanner numFile = new Scanner(new File("numbers.txt"));
		// sumAll(numFile);
      
		//gradeReport("gpas.txt");
	}


	/**
	 * Reads all integer tokens from an input file, adds them up, prints the count,
	 * prints the sum of all numbers and the average
	 * @param fileIn Scanner object connected to a file
	 *
	 */
	public static void sumAll(Scanner fileIn) {
		
	}


	/**
	 *
	 * Creates a Scanner object to read in data from a file
	 * containing a series of student grades
	 * The data in the file has the student's name first and then the name
	 * is followed by 3 GPA grades (not necessarily on the same line):
	 * Nikita 3.7 3.8 4.0
	 *
	 * This method then calculates the student's average GPA and prints the summary in
	 * the console window
	 * Nikita = 3.83 average for 3 grades
	 *
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public static void gradeReport(String fileName) throws FileNotFoundException {

	}
   
}
