package komplex;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserDtoTest {

	@Test
	void testUserDto() {
		
		//UserDto = new UserDto()
		String a = "";
		UserDto ud = new UserDto(a);
		
		assertEquals(ud.getName(), "");
	
		
		
	}

	@Test
	void testGetName() {
		
	//	UserDto udt = mock(UserDto.class);
		UserDto udt = new UserDto("asd");
	//	when(udt.getName()).thenReturn("asd");
		assertEquals(udt.getName(), "asd");
		
	}

	@Test
	void testSetName() {
		UserDto u = new UserDto("maki");
		String v = "aasdfgh";
		u.setName(v);
		assertEquals(u.getName(), "aasdfgh");
		
	}

}