package komplex;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserControllerTest {

	@Test
	void constructorTest() {
	//	User u = mock(User.class)
	//	UserService us = mock(UserService.class);
	//	NeptunCodeGenerator ncg = mock(NeptunCodeGenerator.class);
		
	//	UserController uc = new UserController()
	}
	
	@Test
	void testSave() {
		UserController uc = mock(UserController.class);
		UserDto udto =  new UserDto("ASDFsdghfhrtgj");
		
	
		doNothing().when(uc).save(udto); 	
		
		verify(uc, times(1));
	
	}

}
