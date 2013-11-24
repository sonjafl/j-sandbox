package input;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.person;

public class InputParserTest {
	
	InputParser parser;
	String ui1;
	String ui2;
	String ui3;
	
	
	@Before
	public void setUp() throws Exception {
		parser=new InputParser();
		//parser2=new InputParser();
		//parser3=new InputParser();
		ui1="create sonja 01";
		ui2="delete sonja";
		ui3="show";
		/*uiarray1[0]="create";
		uiarray1[1]="sonja";
		uiarray1[2]="01";
		uiarray2[0]="delete";
		uiarray2[1]="sonja";
		uiarray3[0]="show";
		*/
		
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParse() {
		this.parser.parse(ui1);
		assertEquals("create",this.parser.getUicommand());
		assertEquals("sonja",this.parser.getUinameornumber());
		assertEquals("01",this.parser.getUinumber());
		this.parser.parse(ui2);
		assertEquals("delete",this.parser.getUicommand());
		assertEquals("sonja",this.parser.getUinameornumber());
		assertEquals(null,this.parser.getUinumber());
		this.parser.parse(ui3);
		assertEquals("show",this.parser.getUicommand());
		assertEquals(null,this.parser.getUinameornumber());
		assertEquals(null,this.parser.getUinumber());
	}

	@Test
	public void testValidcommand() {
		
		assertEquals(true,this.parser.validcommand("create"));
		assertEquals(true,this.parser.validcommand("delete"));
		assertEquals(true,this.parser.validcommand("find"));
		assertEquals(true,this.parser.validcommand("show"));
		assertEquals(false,this.parser.validcommand("xx"));

}}
