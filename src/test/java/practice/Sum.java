package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Sum   { 	
	 
	 @Parameters ({"val1", "val2"})
	 public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
}
}

