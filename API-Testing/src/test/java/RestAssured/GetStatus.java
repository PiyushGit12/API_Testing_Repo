package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStatus {
	
	@Test
	public void test() {
		
		Response response= RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("content-type"));
	
		
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		
		
	}

}
