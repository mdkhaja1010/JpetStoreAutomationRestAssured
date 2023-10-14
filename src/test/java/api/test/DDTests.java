package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.CreateLog;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {
	CreateLog log=new CreateLog();
	
	
	@Test(priority=1, dataProvider="Data",dataProviderClass=DataProviders.class)
	public void testPostUser(String userID, String userName, String fname, String lname, String useremail, String pwd, String ph) 
	{
		
		log.info("**************** Creating all User in DD ****************");
		User userPayload =new User();
		userPayload.setId(Integer.parseInt(userID));
		userPayload.setUsername(userName);
		userPayload.setFirstName(fname);
		userPayload.setLastName(lname);
		userPayload.setEmail(useremail);
		userPayload.setPassword(pwd);
		userPayload.setPhone(ph);
		Response response=UserEndPoints.creatUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("****************ALL User is created in DD****************");
		
	}
	
	//@Test(priority = 2,dataProvider="UserNames",dataProviderClass=DataProviders.class)
	public void testGetUserByName(String userName)
	{
		Response response=UserEndPoints.readUser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	 
	@Test(priority = 3,dataProvider="UserNames",dataProviderClass=DataProviders.class)
	public void testDeleteByName(String userName)
	
	{
		
		log.info("**************** Deleting all users in DD ****************");
		Response response=UserEndPoints.deleteUser(userName);
		Assert.assertEquals(response.getStatusCode(), 200);
		log.info("****************All User Deleted in DD****************");
		
	}

}
