package com.bridgelabz;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_PrintAllHeaders 
{
@Test
public void GetHeader()
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
	
	Headers allheaders=response.headers();//capture all the headers from response
	for(Header header:allheaders)
	{
		System.out.println(header.getName()+"     "+header.getValue());
		
		}
   }
}
