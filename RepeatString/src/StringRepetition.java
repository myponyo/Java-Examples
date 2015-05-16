import java.util.Scanner;


public class StringRepetition {

	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter the string to be repeated:");
		String inputString = scanIn.next();
		
		System.out.print("\nEnter a number:");
		int repeatTimes = scanIn.nextInt();
		
		StringRepetition stringRepetition = new StringRepetition();
		stringRepetition.repeatString(inputString, repeatTimes); 
		
		scanIn.close();
	}
	
	public void repeatString(String inputString, int repeatTimes){
		if(repeatTimes <= 0 || inputString.isEmpty())
			return;
		
		StringBuilder result = new StringBuilder(inputString);
		
		for(int i = 0;i<repeatTimes-1;i++){
			result.append(inputString);
		}	
		
		System.out.println("The result string is: "+result);
	}

}
