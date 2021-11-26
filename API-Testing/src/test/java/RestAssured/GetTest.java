package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import  static org.hamcrest.Matchers.*;

public class GetTest {

	@Test
	void test_01() {

		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
//		log().all().
		body("data.id[3]", equalTo(10)).
		body("data.last_name",hasItem("Ferguson"));

	}

	@Test
	void test_02() {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.first_name",hasItems("Lindsay","Byron","Rachel"));
		
		
		
	}
}
