import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface PatternInterface {
	
	boolean validatePattern(String key, String value);
}

public class LamdaUserRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PatternInterface LamdaPatternCheck;
		LamdaPatternCheck = (String key, String value) ->
		{
			Pattern pattern = Pattern.compile(key);
			Matcher match = pattern.matcher(value);
		
			boolean result = match.matches();
			return (result);
		};
		final String Name = "[A-Z]{1}[a-z]{2,}";
		final String Email = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
		final String PhoneNumber = "^[0-9]{2}[ ][0-9]{10}$";
		final String Password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		int Analyzer = 0;
		//to validate first name
		System.out.println("enter first name:");
		String Firstname = scanner.next();
		try {
			if(LamdaPatternCheck.validatePattern(Name, Firstname) == true) {
				System.out.println("First Name Valid");
				Analyzer++;
				}
			else {
				System.out.println("Invalid Input");
				}
		}
		catch(NullPointerException e) {
			System.out.println("Invalid input null!");
		}
		
		//to validate last name
		System.out.println("enter Last name:");
		String Lastname = scanner.next();
		try {
			if(LamdaPatternCheck.validatePattern(Name, Lastname) == true) {
				System.out.println("Last Name Valid");
				Analyzer++;
				}
			else {
				System.out.println("Invalid Input");
				}
		}
		catch(NullPointerException e) {
			System.out.println("Invalid input null!");
		}
		
		//to validate email address
		System.out.println("enter EmailID:");
		String EmailID = scanner.next();
		try {
			if(LamdaPatternCheck.validatePattern(Email, EmailID) == true) {
				System.out.println("EmailID Valid");
				Analyzer++;
				}
			else {
				System.out.println("Invalid Input");
				}
		}
		catch(NullPointerException e) {
			System.out.println("Invalid input null!");
		}
		
		//to validate mobile number
		System.out.println("enter Mobile number:");
		String phoneNumber = scanner.next();
		try {
			if(LamdaPatternCheck.validatePattern(PhoneNumber, phoneNumber) == true) {
				System.out.println("Mobile Number Valid");
				Analyzer++;
				}
			else {
				System.out.println("Invalid Input");
				}
		}
		catch(NullPointerException e) {
			System.out.println("Invalid input null!");
		}
		
		//to validate password
		System.out.println("enter Password:");
		String password = scanner.next();
		try {
			if(LamdaPatternCheck.validatePattern(Password, password) == true) {
				System.out.println("Password Valid");
				Analyzer++;
				}
			else {
				System.out.println("Invalid Input");
				}
		}
		catch(NullPointerException e) {
			System.out.println("Invalid input null!");
		}
		
		
		//Mood Analyzer
		if(Analyzer == 5) {
			System.out.println("HAPPY");
		}
		else
			System.out.println("SAD");
	
	}
	

}
