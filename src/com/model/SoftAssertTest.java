package com.model;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
  @Test(priority=1)
  public void Test() {
	  SoftAssert softassert=new SoftAssert();
	  System.out.println("1");
	 softassert.assertEquals("Ravina", "Ravina");
	 System.out.println("2");
	 softassert.assertEquals('a', 'b');
	 System.out.println("3");
	 softassert.assertEquals(101, 101);
	 System.out.println("4");
	 softassert.assertEquals(true, true);
	 softassert.assertAll();
  }
  @Test(priority=2)
	 public void Test1()
	 {
		 System.out.println("-----Github------");
		 System.out.println("-----eclipse to github------");
	  SoftAssert softassert1=new SoftAssert();
	  System.out.println("5");
	  softassert1.assertEquals(true, true);
		 System.out.println("6");
		 softassert1.assertEquals('a', 'a');
		 System.out.println("7");
		 softassert1.assertEquals(101, 101);
		 System.out.println("8");
		  softassert1.assertEquals("Toppo", "Toppo");
		  softassert1.assertAll();
	 }
  @Test(priority=3)
	 public void Test2()
	 {
	  SoftAssert softassert2=new SoftAssert();
	  System.out.println("9");
	  softassert2.assertEquals(true, true);
		 System.out.println("10");
		 softassert2.assertEquals('a', 'a');
		 System.out.println("11");
		 softassert2.assertEquals(101, 101);
		 System.out.println("12");
		  softassert2.assertEquals("Ravina", "Ravina");
		  	softassert2.assertAll();
}
}
