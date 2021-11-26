package RestAssured;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Delete {

	@Test
	public void del1() {

		given().
		header("content-type", "application/json").
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204);

	}

}
