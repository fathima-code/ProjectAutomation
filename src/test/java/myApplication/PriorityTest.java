package myApplication;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test()
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test(priority = 1)
	public void testCase2() {
		System.out.println("in test case 2");
	}

	@Test(priority = 0)
	public void testCase3() {
		System.out.println("in test case 3");

		
	}

}
