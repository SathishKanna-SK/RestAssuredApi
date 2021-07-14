package com.learning.restassured.base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class sampleRunner {
	
	@BeforeSuite
	public void sample() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
    public void sample1() {
		System.out.println("AfterSuite");
	}

}
