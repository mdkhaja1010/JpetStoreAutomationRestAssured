package api.endpoints;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Properties;
import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//userendpoints created for perform crud operations 
public class UserEndPoints2 {
	
	
	Properties properties= new Properties();
	
	public static ResourceBundle getUrl()
	{
	   ResourceBundle routes=ResourceBundle.getBundle("routes");
	   return routes;
	}
	public static Response creatUser(User payload)
	{
		String post_url=getUrl().getString("post_url");
		Response response=given()
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		 .body(payload)
		.when()
		  .post(post_url);
		
		return response;
	}
	public static Response readUser(String username)
	{
		String get_url=getUrl().getString("get_url");
		Response response=given()
		  .pathParam("username", username)
		.when()
		  .get(get_url);
		
		return response;
	}
	public static Response updateUser(String username, User payload)
	{
		String put_url=getUrl().getString("put_url");
		Response response=given()
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		 .pathParam("username", username)
		 .body(payload)
		.when()
		  .put(put_url);
		return response;
	}
	public static Response deleteUser(String username)
	{
		String delete_url=getUrl().getString("delete_url");
		Response response=given()
		  .pathParam("username", username)
		.when()
		  .delete(delete_url);
		
		return response;
	}

}
