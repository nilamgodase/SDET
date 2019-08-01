package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_validatingJsonResponse 
{
	@Test
	void GET1_ValidateJsonRes()
	{

		//specify base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city"; 
        
		//Request object
		RequestSpecification httprequest=RestAssured.given();	
		
		//Response object
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		//print response in console window
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is"+responseBody);
	Assert.assertEquals(responseBody.contains("Hyderabad"),true);
	
	}
	
}
