package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo1_testNG {
	@BeforeSuite
	public void key_insert() {
		System.out.println("Bike Key inserted");
	}

	@BeforeClass
	public void bike_start() {
		System.out.println("Engine Started");
	}

	@BeforeMethod
	public void first_gear() {
		System.out.println("First gear");
	}

	@Test
	public void second_gear() {
		System.out.println("Second Gear");
	}

	@AfterMethod
	public void thrid_gear() {
		System.out.println("Third Gear");
	}

	@AfterClass
	public void engine_off() {
		System.out.println("Engine off");
	}
	@AfterSuite
	public void side_stand() {
		System.out.println("Side stand");
	}

}
