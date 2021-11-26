package RestAssured;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostDDT {

	@DataProvider(name = "post-1")

	public Object[][] UserIfo() {

		Object[][] data = new Object[][] {

				{ "Testing", "Api" }, { "Method", "Post" }

		};
		return data;

	}

	@Test(dataProvider="post-1")
	void test_1Request(String name, String job) {

		JSONObject r1 = new JSONObject();

		r1.put("name", name);
		r1.put("job", job);

		given().body(r1.toJSONString()).
		post("https://reqres.in/api/users").
		then().
		statusCode(201);

	}

}
