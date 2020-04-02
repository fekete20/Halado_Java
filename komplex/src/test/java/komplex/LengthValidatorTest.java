package komplex;

import static org.junit.jupiter.api.Assertions.*;
/*import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;*/

import org.junit.Test;

import static org.mockito.Mockito.*;
//import static org.junit.Assert.*;

class LengthValidatorTest {

	@Test
	void testIsValid() {
	//	fail("Not yet implemented");
		LengthValidator lv = mock(LengthValidator.class);
		
		User user = new User("Asdasdasd", true, "ABC123");
		
		verify(lv, times(1)).isValid(user);
		
	//	verify(lv, times(1).equals(lv));
		
	//	verify()
		
	}

}
