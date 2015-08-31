package sugk;

import java.util.Scanner;

/**
 * Recursively count the occurrences of the character 'A' in a given string.
 * @author skumar
 */
public class RecursiveCountA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.next().trim();		
		System.out.println("Number of Occurrences of 'A' in "+input+" is: "+countA(input));
		scan.close();
	}
	
	/**
	 * Recursive function that goes through the string calculating the number of occurrences
	 * of the character 'A'.
	 */
	private static int countA(String str){
		if(str.isEmpty() || str.length() == 0){
			return 0;
		}
		
		int index = str.indexOf("A");
		int count = 0;
		if(index == -1){
			return 0;
		}else{
			count = 1;
		}
		
		return count + countA(str.substring(index+1));
	}

}
