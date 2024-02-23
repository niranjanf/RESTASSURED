package new2;

import java.io.IOException;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class runjava {

	static TestNG testNg;
	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { test.class });
		testng.addListener(tla);
		testng.run();
		

		 
	}
}
