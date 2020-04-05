package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class SpaceValidatorTest {

	@Test
	void test() {
		User user = mock(User.class);

		SpaceValidator spaceValidator = new SpaceValidator();
		when(user.getName()).thenReturn("ERfedgdxg");
		assertEquals(spaceValidator.isValid(user), true);

	}

	@Test
	void test1() {
		User user = mock(User.class);

		SpaceValidator spaceValidator = new SpaceValidator();
		when(user.getName()).thenReturn("ERrt sedf");
		assertEquals(spaceValidator.isValid(user), false);

	}

}
