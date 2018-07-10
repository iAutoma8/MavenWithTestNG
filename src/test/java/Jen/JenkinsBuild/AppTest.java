package Jen.JenkinsBuild;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App {
	@Test(priority = 1)
	public void verifyConditionOne() {

		try {
			Assert.assertEquals(false, setData());
		} catch (AssertionError e) {
			System.out.println("Assert Failed");
			Assert.fail();

		}

	}

	@Test(priority = 2)
	public void verifyConditionTwo() {
		try {

			Assert.assertEquals(true, setData());
		} catch (AssertionError e) {
			System.out.println("Assert Failed");
			Assert.fail();

		}

	}

	@Test(priority = 3)
	public void verifyConditionThree() {
		try {

			Assert.assertTrue(setData());
		} catch (AssertionError e) {
			System.out.println("Assert Failed");
			Assert.fail();

		}

	}

}
