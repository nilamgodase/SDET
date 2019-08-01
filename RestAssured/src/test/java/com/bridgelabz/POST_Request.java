package com.bridgelabz;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_Request
{
	@Test
	void Registration_POST()
	{
	//specify base URI
			RestAssured.baseURI="http://192.168.0.50:8000/api/user"; 
	        
			//Request object
			RequestSpecification httprequest=RestAssured.given();	
			
			//Request payload sending along with post request
			
			JSONObject requestParams=new JSONObject();
			requestParams.put("email","abcd@gmail.com");
			requestParams.put("password", "abc");
			httprequest.header("Content-Type","application/json");
			httprequest.body(requestParams.toJSONString()); //attach above data to the request
			
			//Response object
			Response response=httprequest.request(Method.POST,"/login?access_token=rYP0XcvSkmHYnh63I0IHyPJbrmP7YVG0P4HigmTAIgGcmyeIzFBot9Z7pM23q0iT");
			//print response in console window
			
			String responseBody=response.getBody().asString();
			System.out.println("Response body is"+responseBody);
		
			
			//status code validation
			
			int statusCode=response.getStatusCode();	
			System.out.println("status code is:"+statusCode);
			Assert.assertEquals(statusCode, 200);
			//Success code validation
	       //String successCode=response.jsonPath().get("SuccessCode");
	//	assertEquals(successCode, "");
		
}
}