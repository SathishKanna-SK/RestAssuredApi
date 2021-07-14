package com.learning.restassured.testcase;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestUsers {
	
	
	@Test
	public void getUsers() {    	
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Test Response :"+ response.statusCode());
	}

}
