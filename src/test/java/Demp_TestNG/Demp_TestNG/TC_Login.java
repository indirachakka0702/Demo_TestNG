package Demp_TestNG.Demp_TestNG;

import org.testng.annotations.Test;

public class TC_Login {

	@Test
	public void TC_Login_01() {
		System.out.println("TC_Login_01 Executed");
	}
	@Test
	public void TC_Login_02() {
		System.out.println("TC_Login_02 Executed");
	}
	@Test(enabled = false)
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
	}
	@Test
	public void TC_Login_04() {
		System.out.println("TC_Login_04 Executed");
	}
}
