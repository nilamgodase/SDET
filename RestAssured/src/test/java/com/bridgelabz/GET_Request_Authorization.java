package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request_Authorization 
{
@Test
public void AuthoriztaionTest()
{
	//specify base URI
	RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication"; 
    
	//Basic authentication
	PreemptiveBasicAuthScheme authshceme=new PreemptiveBasicAuthScheme();
	authshceme.setUserName("ToolsQA");
	authshceme.setPassword("TestPassword");
	RestAssured.authentication=authshceme;
	
	
	//Request object
	RequestSpecification httprequest=RestAssured.given();	
	
	//Response object
	Response response=httprequest.request(Method.GET,"/");
	
	//print response in console window
	 String responseBody=response.getBody().asString();
	 System.out.println("Response body is"+responseBody);
			
	//status code validation
	int statusCode=response.getStatusCode();	
	System.out.println("status code is:"+statusCode);
	Assert.assertEquals(statusCode, 200);
		

}
}
