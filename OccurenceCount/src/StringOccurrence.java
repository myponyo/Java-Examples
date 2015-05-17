import java.util.HashMap;
import java.util.Scanner;


/* This program finds the number of occurrences of a substring within a string */

public class StringOccurrence {

	public static void main(String[] args){
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanIn.next();
		System.out.print("\nEnter a substring: ");
		String subString = scanIn.next();
		scanIn.close();
		
		StringOccurrence stringOccurence = new StringOccurrence();
		stringOccurence.findOccurrence(inputString, subString);
	}
	
	public void findOccurrence(String inputString, String subString){
		if(inputString == null || subString == null || inputString.isEmpty() || subString.isEmpty()){
			return;
		}
		//Check the length
		if(subString.length() > inputString.length()){
			return;
		}
		int count = 0;
		
		for(int i=0;i<inputString.length();){
			
			if(i+subString.length() > inputString.length()){
				break;
			}
			if(inputString.substring(i, i+subString.length()).equals(subString)){
				count++;
				i = i + subString.length();
			}
			else{
				i++;
			}
			
		}
		
		System.out.printf("\nNumber of occurrences of %s in %s is %d",subString,inputString,count);
	}
}
