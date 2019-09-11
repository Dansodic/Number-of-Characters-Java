import java.util.Scanner;

public class NumChar {

	public static void main(String[] args) {
		String input;
		int numChar;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string ");
		input = sc.nextLine();

    	numChar = input.length() ;
    	
		System.out.println("The number of characters in the given string(including spaces) is: " + numChar);

	}

}
