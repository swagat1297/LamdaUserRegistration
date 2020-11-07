import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface PatternInterface {
	
	boolean validatePattern(String key, String value);
}
public class LamdaUserRegistration {
		PatternInterface LamdaPatternCheck = (String key, String value) ->
		{
			Pattern pattern = Pattern.compile(key);
			Matcher match = pattern.matcher(value);
		
			boolean result = match.matches();
			return (result);
		};
		final String NameRegex = "[A-Z]{1}[a-z]{2,}";
		final String EmailRegex = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
		final String PhoneNumberRegex = "^[0-9]{2}[ ][0-9]{10}$";
		final String PasswordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
		int Analyzer = 0;
		//to validate first name
		public boolean validateFirstName(String firstName) {
			try {
				boolean result = LamdaPatternCheck.validatePattern(NameRegex, firstName);
				return result;
			}
				catch(NullPointerException e) {
					return false;
				}
		}
		
		//to validate last name
		
		public boolean validateLastName(String lastName) {
			try {
				boolean result = LamdaPatternCheck.validatePattern(NameRegex, lastName);
				return result;
			}
							catch(NullPointerException e) {
					return false;
				}
		}
		
		//to validate email address
		public boolean validateEmail(String emailID) {
			try {
				boolean result = LamdaPatternCheck.validatePattern(EmailRegex, emailID);
				return result;
			}
				catch(NullPointerException e) {
					return false;
				}
		}
		
		//to validate mobile number
		public boolean validateMobileNumber(String mobileNumber) {
			try {
				boolean result = LamdaPatternCheck.validatePattern(PhoneNumberRegex, mobileNumber);
				return result;
			}
				catch(NullPointerException e) {
					return false;
				}
		}
		
		//to validate password
		public boolean validatePassword(String password) {
			try {
				boolean result = LamdaPatternCheck.validatePattern(PasswordRegex, password);
				return result;
			}
				catch(NullPointerException e) {
					return false;
				}
		}
	
		
		


}
