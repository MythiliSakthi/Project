package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task 
{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
	}
	
@Test
private void test() {
	System.out.println("test");

}
@AfterClass
private void afterclass() {
	System.out.println("After class");
}

}
