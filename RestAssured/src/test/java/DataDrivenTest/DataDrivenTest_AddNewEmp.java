package DataDrivenTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenTest_AddNewEmp 
{
@Test(dataProvider="empdataprovider")
void postaddNewEmp(String ename,String eage,String esal)
{
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1"; 
	
	RequestSpecification httpRequest=RestAssured.given();	
   //here we created data which we can send along with the post request
	JSONObject requestParams=new JSONObject();
	
	requestParams.put("name", ename);
	requestParams.put("salary", esal);
	requestParams.put("age", eage);
	
	//Add header stating the request body is a json
	httpRequest.header("Content-Type","application/json");
	
	//Add the json to the body 
	httpRequest.body(requestParams.toJSONString());
    
	//Post request
	Response response=httpRequest.request(Method.POST,"/create");
    
	//Capture response body to perform validations
	String responseBody=response.getBody().asString();
	System.out.println("Response body is "+responseBody);

    Assert.assertEquals(responseBody.contains(ename),true);   
    Assert.assertEquals(responseBody.contains(esal),true);   
    Assert.assertEquals(responseBody.contains(eage),true);  
   
    int statuscode=response.getStatusCode();
    Assert.assertEquals(statuscode, 200);

    }

   @DataProvider(name="empdataprovider")
    String [][] getEmpData() throws IOException
    {
	 
 //Read data from excel
	String path="/home/admin/eclipse-workspace/RestAssured/src/test/java/DataDrivenTest/empdata.xlsx";
	int rowcount=XLUtil.getRowCount(path,"Sheet1");
    int colcount=XLUtil.getCellCount(path,"sheet1", 1);
	String empdata[][]=new String[rowcount][colcount];
	
	for(int i=1;i <= rowcount;i++)
	{
		for(int j=0;j< colcount;j++)
		{
			empdata[i - 1][j]=XLUtil.getCellData(path,"Sheet1", i,j);
		}
			
	}
	
	//  String empdata[][]= {{"abcr12","3000","24"},{"xyzr1","50000","25"},{"mona12","55000","28"}};
    return(empdata);
}
}