package InputName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import java.io.*;

public class TestInputName {
	
	private final InputStream systemIn = System.in;
	private final PrintStream systemOut = System.out;
	private ByteArrayInputStream testIn;
	private ByteArrayOutputStream testOut;
	
	@BeforeEach
	public void setUpOutput() {
	    testOut = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(testOut));
	}

	@AfterEach
	public void restoreSystemInputOutput() {
	    System.setIn(systemIn);
	    System.setOut(systemOut);
	}
	
	private void provideInput(String data) {
	    testIn = new ByteArrayInputStream(data.getBytes());
	    System.setIn(testIn);
	}
	
	@Test
	public void testName() {		

		String expected = "What is your first name?\nHello Patrick\n";
		String input = "Patrick";
		provideInput(input);
	    // action
	    InputName.main(null);
	    
	    assertEquals(expected, testOut.toString());

		
	}
}
