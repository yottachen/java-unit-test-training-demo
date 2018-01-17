package scenario13;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class APITest {

    @BeforeClass
    public static void setup() {
        RestAssured.port = Integer.valueOf(8080);
        RestAssured.baseURI = "http://localhost";
    }


    @Test
    public void shouldReturn200WhenGoogleIsUp() {
        given().when().get("http://www.google.com").then().statusCode(200);
    }

    @Test
    public void shouldReturn200WhenOrderServiceIsUp() {
        given().when().get("").then().statusCode(200).
                body("id", equalTo(1)).
                body("content", equalTo("World"));
    }

}
