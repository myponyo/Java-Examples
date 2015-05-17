import java.util.Scanner;

/* This program allows you to repeat every character in a string */
public class CharDuplication {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanIn.next();
		scanIn.close();
		
		CharDuplication charDuplication = new CharDuplication();
		charDuplication.duplicateCharacters(str);
		
	}
	
	public void duplicateCharacters(String str){
		
		if(str == null || str.length() <=0){
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			sb.append(ch+""+ch);
		}
		
		System.out.println("\nResult: "+sb.toString());
	}

}
