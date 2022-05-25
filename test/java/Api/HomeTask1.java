package Api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HomeTask1 {

    @Test(priority = 0)
    public void put() {
        Category category = new Category(1, "dog");
        Pet pets = new Pet(1234567, category, "Bull Dog", "pending");

        given().baseUri("https://petstore.swagger.io/v2").contentType("application/json").body(pets)
                .when().post("/pet")
                .then().statusCode(200).contentType("application/json")
                .body("status", equalTo("pending")).body("category.name", equalTo("dog"))
                .body("name", equalTo("Bull Dog")).body("status", equalTo("pending"));
    }

    @Test(priority = 1)
    public void get() {
        Response response = given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users");
        response.then().assertThat().statusCode(200);
        List<LinkedHashMap<String, Object>> list = response.getBody().as(List.class);
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).containsValue("Ervin Howell")) {
                flag = true;
                break;
            }else
                flag = false;
        }
        Assert.assertTrue(flag);
        Assert.assertEquals(list.size() > 3, true);
    }
}
