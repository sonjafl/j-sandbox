package input;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InputParserTest {
	
	InputParser parser;
	String ui1;
	String ui2;
	String ui3;
	
	
	@Before
	public void setUp() throws Exception {
		parser=new InputParser();
		ui1="create sonja 01";
		ui2="delete sonja";
		ui3="SHOW";
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParse() {
		this.parser.parse(ui1);
		assertEquals("CREATE",this.parser.getUicommand());
		assertEquals("sonja",this.parser.getUinameornumber());
		assertEquals("01",this.parser.getUinumber());
		this.parser.parse(ui2);
		assertEquals("DELETE",this.parser.getUicommand());
		assertEquals("sonja",this.parser.getUinameornumber());
		assertEquals(null,this.parser.getUinumber());
		this.parser.parse(ui3);
		assertEquals("SHOW",this.parser.getUicommand());
		assertEquals(null,this.parser.getUinameornumber());
		assertEquals(null,this.parser.getUinumber());
	}

	@Test
	public void testValidcommand() {
		
		assertEquals(true,this.parser.validcommand("CREATE"));
		assertEquals(true,this.parser.validcommand("DELETE"));
		assertEquals(true,this.parser.validcommand("FIND"));
		assertEquals(true,this.parser.validcommand("SHOW"));
		assertEquals(false,this.parser.validcommand("xx"));

}}
