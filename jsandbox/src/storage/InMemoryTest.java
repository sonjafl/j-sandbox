package storage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.person;

public class InMemoryTest {
	
	InMemory storage;
	person person1;
	person person2;
	
	
	
	
	@Before
	public void setUp() throws Exception {
		this.storage = new InMemory();
		this.person1=new person("x1", "1");
		this.person2=new person("x2", "2");
		
		storage.create("x1","1");
		storage.create("x2","2");
		
		
	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFind() {
		person p1 = this.storage.find("x1");
		person p2 = this.storage.find("x2");
		assertNotNull(p1);
		assertNotNull(p2);
		assertEquals("1",p1.getNumber());
		assertEquals("2",p2.getNumber());
		
		person p3 = this.storage.find("1");
		person p4 = this.storage.find("2");
		assertNotNull(p1);
		assertNotNull(p2);
		assertEquals("x1",p1.getName());
		assertEquals("x2",p2.getName());
	}


	@Test
	public void testDelete() {
		assertTrue(this.storage.delete("x1"));
		assertEquals(null,this.storage.find("x1"));
	}

	@Test
	public void testCreate() {
		InMemory s = new InMemory();
		
		s.create("x1","1");
		s.create("x2","2");
		person p3 = this.storage.create("x3","3");
		assertEquals(p3,this.storage.find("x3"));
		assertEquals(p3,this.storage.find("3"));
		//person p4 = this.storage.create("x4",null);
		assertEquals(null,this.storage.create("x4",null));
		
	}

	@Test
	public void testShow() {
		//kriegt personList zurueck, die soll die zwei personen enthalten;
		ArrayList<person> list= this.storage.show();
		person p1 = list.get(0);
		person p2 = list.get(1);
		assertEquals("x1",p1.getName());
		assertEquals("1",p1.getNumber());
		assertEquals("x2",p2.getName());
		assertEquals("2",p2.getNumber());
	}

}
