package Api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class HomeTask2 {


    @Test
    public void get(){
        Response response = given().baseUri("http://api.openweathermap.org/data/2.5")
                .when().get("/weather?q=hyderabad&appid=6f541a731208fa4240a40cdf50dae93c");
        JsonPath json = response.jsonPath();
        Object  longitude = json.get("coord.lon");
        Object  latitude =json.get("coord.lat");

        Response response1 = given().baseUri("http://api.openweathermap.org/data/2.5")
                .when().get("/weather?lat=" + latitude + "&lon=" + longitude + "&appid=6f541a731208fa4240a40cdf50dae93c");
        response1.then().assertThat().statusCode(200);
        JsonPath path =response1.jsonPath();
        String name = path.get("name");
        Assert.assertEquals(name,"Hyderabad");
        String country = path.get("sys.country");
        Assert.assertEquals(country,"IN");
        float minTemp = path.get("main.temp_min");
        Assert.assertEquals(minTemp>0,true);
        float temparature = path.get("main.temp");
        Assert.assertEquals(temparature>0,true);

    }
}
