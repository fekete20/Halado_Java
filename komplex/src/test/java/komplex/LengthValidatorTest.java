package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class LengthValidatorTest {

	LengthValidator lengthValidator = new LengthValidator();

	@Test
	void isUserNameIsNotLongEnouhg() {

		// mock
		User user = mock(User.class);

		// when, beállítja amit várunk
		when(user.getName()).thenReturn("Asddsdfdgdsd");

		// assert
		assertTrue(lengthValidator.isValid(user));

	}

	@Test
	void isUserNameIsLongEnough() {

		// mock
		User user = mock(User.class);

		// when, beállítja amit várunk
		when(user.getName()).thenReturn("Asd");

		// assert
		assertFalse(lengthValidator.isValid(user));
	}
}
