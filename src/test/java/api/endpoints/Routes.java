package api.endpoints;
//urls from petstore swagger---https://petstore.swagger.io
//createUser (POST): https://petstore.swagger.io/v2/user
//GetUser (GET): https://petstore.swagger.io/v2/user/{username}
//UpdateUSer (Put): https://petstore.swagger.io/v2/user/{username}
//DeleteUser (Delete): https://petstore.swagger.io/v2/user/{username}


public class Routes {
	public static String base_url="https://petstore.swagger.io/v2";//baseUrl
	//user module
	//endpoints
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String put_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
  //store moudule urls 
	//petmodule urls created here

}
