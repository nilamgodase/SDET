package com.bridgelabz;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_validateHeaders 
{
	@Test
	void GET1_ALLusers()
	{

		//specify base URI
		RestAssured.baseURI="http://192.168.0.50:8000/api"; 
        
		//Request object
		RequestSpecification httprequest=RestAssured.given();	
		
		//Response object
		Response response=httprequest.request(Method.GET,"/user?access_token=rYP0XcvSkmHYnh63I0IHyPJbrmP7YVG0P4HigmTAIgGcmyeIzFBot9Z7pM23q0iT");
		
		//print response in console window
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is"+responseBody);
		
		//status code validation
		
		int statusCode=response.getStatusCode();	
		System.out.println("status code is:"+statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//status line verification
		
		String statusLine=response.getStatusLine();
		System.out.println("Status Line is "+statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
		
		//captured details of headers from response
	String ContentType=response.header("Content-Type");
	System.out.println(" ContentType is "+ContentType);
	Assert.assertEquals(ContentType, "application/json; charset=utf-8");
	
	//String ContentEncoding=response.header("Content-Encoding ");
     //System.out.println("Content-Encoding is "+ContentEncoding );
     //assertEquals(ContentEncoding , "gzip");
		 }

}
