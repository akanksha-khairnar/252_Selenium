package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestng_Demo {
	@Test(priority=4,groups="smoke")
	void Ameriaca() {
		System.out.println("this is America");
	}
	@Test(priority=2,groups="sanity")
	void Shrilanka() {
		System.out.println("this is Shrilanka");
		Assert.assertTrue(false);
	}
	@Test(priority=3,groups="sanity")
	void Japan() {
		System.out.println("this is Japan");
		Assert.assertTrue(false);
	}
	@Test(priority=1,groups="smoke")
	void India() {
		System.out.println("this is India");
	}
	

	

}
