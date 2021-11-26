package RestAssured;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Put {
	
	@DataProvider(name = "post-2")

	public Object[][] UserIfo() {

		Object[][] data = new Object[][] {

				{ "Testing", "Api" }, { "Method", "Put" }

		};
		return data;

	}

	@Test(dataProvider="post-2")
	void test_2Request(String name, String job) {

		JSONObject r1 = new JSONObject();

		r1.put("name", name);
		r1.put("job", job);

		given().body(r1.toJSONString()).
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);

	}
	

}
