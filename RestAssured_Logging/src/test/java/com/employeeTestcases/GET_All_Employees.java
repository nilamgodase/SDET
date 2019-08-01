package com.employeeTestcases;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import com.employeebase.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GET_All_Employees extends TestBase
{
    @BeforeClass
    void getAllEmployees() throws InterruptedException
    {
    logger.info("***************Started GET_All_Employees***************");
    
    
    RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
    httpRequest=RestAssured.given();
    response=httpRequest.request(Method.GET,"/employees");
    
    Thread.sleep(3);
    }
    
    @Test
    void checkResponseBody()
    {
    logger.info("************Checking Response Body*********");
    
    String responseBody=response.getBody().asString();
    logger.info("Response Body==>"+responseBody);
    Assert.assertTrue(responseBody!=null);
    }
    
    @Test
    void checkStatusCode()
    {
    logger.info("*******Checking Status Code***********");
    int statusCode=response.getStatusCode();
    logger.info("Status Code is==>"+statusCode);
    Assert.assertEquals(statusCode, 200);
    }
    @Test
    void checkResponseTime()
    {
    logger.info("********checking Response Time*********");
    long  responseTime=response.getTime();
    if(responseTime>2000)
    logger.info("Response Time is==>"+responseTime);
    Assert.assertTrue(responseTime<10000);
    }
    
    @Test
    void checkstatusLine()
    {
    logger.info("*******Checking Status Line*********");
    String statusLine=response.getStatusLine();
    logger.info("Status Line is==>"+statusLine);
    Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
    }
    @Test
    void checkContentType()
    {
    logger.info("*******checking Content Type*******");
    String contentType=response.getContentType();
    logger.info("Content Type is==>"+contentType);
    Assert.assertEquals(contentType, "text/html; charset=UTF-8");
    }
    @Test
    void checkServerType()
    {
    logger.info("******checking Server Type********");
    String serverType=response.header("server");
    logger.info("Server Type is==>"+serverType);
    Assert.assertEquals(serverType, "Apache");
    }
    @Test
    void checkContentEncoding()
    {
    logger.info("********Checking Content Encoding*******");
    String contentEncoding=response.header("Content-Encoding");
    logger.info("Content Encoding is==>"+contentEncoding);
    Assert.assertEquals(contentEncoding, "gzip");
    }
    
    @Test
    void checkContentLength()
    {
    logger.info("*****Checking Content Length*********");
    String contentLength=response.header("Content-Length");
    logger.info("Content Length is==>"+contentLength);
    
    if(Integer.parseInt(contentLength)<100)
    logger.warn("Content Length is less than 100");
    Assert.assertTrue(Integer.parseInt(contentLength)>100);
    }
    
    @Test
    void checkCookies()
    {
    logger.info("******Checking Cookies***********");
    
    String cookie=response.getCookie("PHPSESSID");
    
    }
    
    @AfterClass
    void tearDown()
    {
    logger.info("*******Finished GET_All_Employees");
    }
    
}
