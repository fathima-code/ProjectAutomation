package myApplication;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = {"Regression"})
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test()
	public void testCase2() {
		System.out.println("in test case 2");
	}

	@Test(groups = {"Functional"})
	public void testCase3() {
		System.out.println("in test case 3");
	}

	@Test(groups = {"Regression", "Functional"})
	public void testCase4() {
		System.out.println("in test case 4");
	}

	@Test()
	public void testCase5() {
		System.out.println("in test case 5");
	}


}
