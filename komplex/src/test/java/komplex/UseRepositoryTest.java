package komplex;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UseRepositoryTest {
	
	UseRepository ur = new UseRepository();
	
	@Test
	public void testSave() {
		User u = mock(User.class);
		
		when(u.getName()).thenReturn("Asdf");
		ur.save(u);
		
		assertEquals(ur.findAll().get(0), u);
		assertEquals(ur.findAll().size(), 1); 
		
		
	}
	
	@Test
	public void testGetByNeptunCode() {
		User u = mock(User.class);
		
		when(u.getNeptunkod()).thenReturn("ASD123");
		ur.save(u);
		
		assertEquals(ur.getByNektunKod("ASD123"), u);
		assertEquals(ur.getByNektunKod("asd"), null);
	}
	
	@Test
	public void testFindByEnabledIsTrue() {
		User u = mock(User.class);
		User u1 = mock(User.class);
		when(u.isEnabled()).thenReturn(true);
		when(u1.isEnabled()).thenReturn(false);
		ur.save(u);
		ur.save(u1);
		assertEquals(ur.findByEnabledIsTrue().get(0), u);
		assertEquals(ur.findByEnabledIsTrue().size(), 1);
	//	assertEquals(ur.findByEnabledIsTrue().get(0), u1);
		
	}


	
}
