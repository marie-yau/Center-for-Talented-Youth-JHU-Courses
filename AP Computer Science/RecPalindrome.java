/**
 * 
 * @author Marie Dohnalová
 * This program tests if the string is a palidrome.
 */
import java.util.Scanner;


public class RecPalindrome {

	public static void main(String[] args) {
		String str1, str2 = "";
		
                // get input from user
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		
                
		for(int i = 0;i < str1.length(); i++)
			if(Character.isLetter(str1.charAt(i)))
				str2 += str1.charAt(i);
		
                // print the result
		if(testPalyndrome(str2, 0))
			System.out.println("The string \"" + str1 + "\" is a palindrome.");
		else
			System.out.println("The string \"" + str1 + "\" is not a palindrome.");
	}
	/*
        test if string is a palindrome
        precondition: s and ind must be initialized
        postcondition: return true or false
        */
	static boolean testPalyndrome(String s, int ind){
		if(s.length() - 2 * ind <= 1) return true;
		if(s.charAt(ind) != s.charAt(s.length() - ind - 1)) return false;
		
		return testPalyndrome(s, ind + 1);
	}
}