package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



import org.junit.jupiter.api.Test;

class LengthValidatorTest2 {

/*	@Test
	void testIsValid() {
		LengthValidator lv = mock(LengthValidator.class);
		
		User user = new User("Asdasdasd", true, "ABC123");
		when(lv.isValid(user)).thenReturn(true);
		//verify(lv, times(1)).isValid(user);
		assertEquals(lv.isValid(user), true);
	}
*/
	LengthValidator lv = new LengthValidator();
	@Test
	void isUserNameIsNotLongEnouhg() {
		
		//mock
		User user = mock(User.class);
		
		//when, beállítja amit várunk
		when(user.getName()).thenReturn("Asddsdfdgdsd");
		
		//assert
		assertTrue(lv.isValid(user));
		
		
	}
	
	@Test
	void isUserNameIsLongEnough() {
		
		//mock
				User user = mock(User.class);
				
				//when, beállítja amit várunk
				when(user.getName()).thenReturn("Asd");
				
				//assert
				assertFalse(lv.isValid(user));
	}
}
