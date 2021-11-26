package RestAssured;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostMethods {

	@Test
	void test_1Request() {

		JSONObject r1 = new JSONObject();

		r1.put("name", "morpheus");
		r1.put("job", "leader");

		given().body(r1.toJSONString()).post("https://reqres.in/api/users").then().statusCode(201);

	}

}
