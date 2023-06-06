package com.bridglabz.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import com.bridglabz.UserRegistrationMain;

public class UserRegistrationTest {

	    static UserRegistrationMain userRegistration;
	   
	    @Test
	    public void firstNmeShouldBeTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.checkFirstName("Shital");
	        Assertions.assertEquals(true, value);
	    }
	    @Test
	        public void firstNmeShouldBeFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	            boolean value = userValidator.checkFirstName("shital");
	            Assertions.assertEquals(false, value);
	        }

	    @Test
	    public void lastNameTest2_ShouldReturnTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.checkLastName("Darade");
	        Assertions.assertEquals(true, value);
	    }
	    @Test
	    public void lastNameTest2_ShouldReturnFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.checkLastName("darade");
	        Assertions.assertEquals(false, value);
	    }

	    @Test
	    public void emailTest3_ShouldReturnTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();

	        boolean value = userValidator.checkEmail("shitalkarad24@gmail.com");
	        Assertions.assertEquals(true, value);
	    }
	    @Test
	    public void emailTest3_ShouldReturnFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.checkEmail("shitalkarad24#gmail.com");
	        Assertions.assertEquals(false, value);
	    }

	    @Test
	    public void numberTest4_ShouldReturnTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.phoneNumber("91 8956561212");
	        Assertions.assertEquals(true, value);
	    }
	    @Test
	    public void numberTest4_ShouldReturnFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.phoneNumber("91 8956561212");
	        Assertions.assertEquals(false, value);
	    }
	    @Test
	    public void passWordTest5_ShouldReturnTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.passWord("Shitalkarad24@123");
	        Assertions.assertEquals(true ,value);
	    }
	    @Test
	    public void passWordTest5_ShouldReturnFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean value = userValidator.passWord("Shital@123");
	        Assertions.assertEquals(false ,value);
	    }

	    @Test
	    public void testMobileNumberTrue() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean isValid = userValidator.phoneNumber("91 9994982171");
	        Assertions.assertEquals(true, isValid);
	    }

	    @Test
	    public void testMobileNumberFalse() {
	        UserRegistrationMain userValidator = new UserRegistrationMain();
	        boolean isValid = userValidator.phoneNumber(" 9994982171");
	        Assertions.assertEquals(false, isValid);
	    }
	}