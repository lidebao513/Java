package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/19.
 */
public class Header {
    @Test
    public void headerTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/header";
        Response response = given()
                .header("access_token","rSWamyAYwuHCo7IFAgd1oRpSP7nzL7BF5t7ItqpKViM")
                .when().log().all().get();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
}
