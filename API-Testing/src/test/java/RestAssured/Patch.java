package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Patch {

	@Test
	public void Patch_Test() {

		JSONObject r1 = new JSONObject();

		r1.put("name", "morpheus");

		given().body(r1.toJSONString()).patch("https://reqres.in/api/users/2").then().statusCode(200);

	}

}
