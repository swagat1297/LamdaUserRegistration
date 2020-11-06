import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.*;

public class UserRegistration {
	
	public static String firstName = null;
	public static String lastName = null;
	public static String emailID = null;
	public static String mobileNumber = null;
	public static String password = null;

	//to check valid first name//
	public boolean validateFirstName(String firstName) {
		try {
			String read = "[A-Z][a-z]{3,}";
			String text = firstName;
		
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
		
			boolean result = match.matches();
			return (result);
		}
		catch(Exception e) {
			return false;
		}
		
	}
	//to check valid last name//
	public boolean validateLastName(String lastName) {
		try {
			String read = "[A-Z][a-z]{3,}";
			String text = lastName;
		
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
		
			boolean result = match.matches();
			return (result);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	//to check valid email//
	public boolean validateEmail(String emailID) {
		try{
		String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";		
		Pattern pattern = Pattern.compile(read);
		Matcher match = pattern.matcher(emailID);
		
		boolean result = match.matches();
		return (result);
		}
		catch(Exception e) {
			return false;
		}
		
		
	}
	//to check valid mobile number//
	public boolean validateMobileNumber(String mobileNumber) {
		try {
			String read = "^[0-9]{2}[ ][0-9]{10}$";	
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(mobileNumber);
		
			boolean result = match.matches();
			return (result);
		}
		catch(Exception e) {
			return false;
		}
	}
	//check password with Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character//
	public boolean validatePassword(String password) {
		try {
			String read = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
			String text = password;
		
			Pattern pattern = Pattern.compile(read);
			Matcher match = pattern.matcher(text);
		
			boolean result = match.matches();
			return (result);
		}
		catch(Exception e) {
			return false;
		}
	}

	public static void main(String[] args) {
		UserRegistration result = new UserRegistration();
		Scanner number = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your choice to check:\n\n 1.FirstName\n 2.LastName\n 3.Email\n 4.PhoneNumber\n 5.password\n 6.Exit");
			int option = number.nextInt();
			switch(option) {
				case 1:result.validateFirstName(firstName );
						break;
				case 2:result.validateLastName(lastName );
						break;
				case 3:result.validateEmail(emailID );
						break;
				case 4:result.validateMobileNumber(mobileNumber );
						break;
				case 5:result.validatePassword(password);
						break;
				case 6: System.exit(0);
						break;
				default:
						System.out.println("Wrong Input");
			}
			number.close();
		
		} 
	}


}