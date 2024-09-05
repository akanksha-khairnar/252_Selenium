package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeClass
	void BC() {
		System.out.println("this is before class annotation");
	}
	@AfterClass
	void AC() {
		System.out.println("this is after class annotation");
	}
	@BeforeMethod
		void BM() {
			System.out.println("this is before method annotation");
		}
	@AfterMethod
		void AM() {
			System.out.println("this is after method anotation ");
		}
	@Test(priority=1)
	void show() {
		System.out.println("this is show method");
	}
	@Test(priority=2)
	void display() {
		System.out.println("this is display method");
	}

}
