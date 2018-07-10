package Jen.JenkinsBuild;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App 
{
@Test(priority=1)
public void verifyConditionOne()
{
	Assert.assertEquals(false, setData());
	
	
}
@Test(priority=2)
public void verifyConditionTwo()
{
	
	Assert.assertEquals(true, setData());
	
}
@Test(priority=3)
public void verifyConditionThree()
{
	
	Assert.assertTrue(setData());
	
}
	
	

}
