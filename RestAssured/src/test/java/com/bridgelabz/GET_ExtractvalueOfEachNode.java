package com.bridgelabz;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ExtractvalueOfEachNode 
{
	void GET()
	{ 
		//specify base URI
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city"; 
        
		//Request object
		RequestSpecification httprequest=RestAssured.given();	
		
		//Response object
		Response response=httprequest.request(Method.GET,"/Hyderabad");
		
		JsonPath jsonpath=response.jsonPath();
		System.out.println(jsonpath.get("City"));
		System.out.println(jsonpath.get("Temperature"));
		System.out.println(jsonpath.get("Humidity"));
		System.out.println(jsonpath.get("WeatherDescription"));
		System.out.println(jsonpath.get("WindSpeed"));
		System.out.println(jsonpath.get("WindDirectionDegree"));
         Assert.assertEquals(jsonpath.get("Temperature"), "39 degree celsius");
       
	}
	
}