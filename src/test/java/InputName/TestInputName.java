package InputName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

public class TestInputName {
	
	@Test
	public void testName() {		
		
		PrintStream originalOut = System.out;
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(bos));

	    // action
	    InputName.main(null);
	    
	    InputStream sysInBackup = System.in;
		ByteArrayInputStream in = new ByteArrayInputStream("Patrick".getBytes());
		System.setIn(in);

	    // assertion
	    assertEquals("What is your first name?\nHello Patrick\n", bos.toString());
	    
	    
	    System.setIn(sysInBackup);
		System.setOut(originalOut);
		
	}
}
