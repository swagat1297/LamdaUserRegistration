import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LamdaUnitTesting {

	@Test
	public void validateFirstNametestingIfTrue() {
		LamdaUserRegistration firstNameValidateTest = new LamdaUserRegistration();
		 boolean output = firstNameValidateTest.validateFirstName("Swagat");
		 assertEquals(true, output);
	}
	@Test
	public void validateLastNametestingIFTrue() {
		LamdaUserRegistration lastNameValidateTest = new LamdaUserRegistration();
		 boolean output = lastNameValidateTest.validateLastName("Bhattacahrjee");
		 assertEquals(true, output);
	}
	@Test
	public void validateEmailIDtestingIFTrue() {
		LamdaUserRegistration emailIDValidateTest = new LamdaUserRegistration();
		 boolean output = emailIDValidateTest.validateEmail("swagag.wdwd@gmail.com");
		 assertEquals(true, output);
	}
	@Test
	public void validateMobileNumbertestingIFTrue() {
		LamdaUserRegistration firstNameValidateTest = new LamdaUserRegistration();
		 boolean output = firstNameValidateTest.validateMobileNumber("32 2929292658");
		 assertEquals(true, output);
	}
	@Test
	public void validatePasswordtestingIFTrue() {
		LamdaUserRegistration firstNameValidateTest = new LamdaUserRegistration();
		 boolean output = firstNameValidateTest.validatePassword("wdadadS@212");
		 assertEquals(true, output);
	}


}
