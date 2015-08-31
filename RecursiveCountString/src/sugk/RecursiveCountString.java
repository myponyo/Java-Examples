package sugk;

import java.util.Scanner;

/**
 * Recursively count the occurrences of a substring in a given string.
 * @author skumar
 */
public class RecursiveCountString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.next().trim();
		System.out.print("Enter a substring: ");
		String substring = scan.next().trim();		
		System.out.println("Number of Occurrences of '"+substring+"' in "+input+" is: "+countString(input,substring));
		scan.close();
	}
	
	/**
	 * Recursive function that goes through the string calculating the number of occurrences
	 * of the character 'A'.
	 */
	private static int countString(String str, String substring){
		if(str.isEmpty() || str.length() == 0){
			return 0;
		}
		
		int index = str.indexOf(substring);
		int count = 0;
		if(index == -1){
			return 0;
		}else{
			count = 1;
		}
		
		return count + countString(str.substring(index+1),substring);
	}

}
