package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/18.
 */
public class Params {
    @Test
    public void restfulParamsTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/users/admin";
        Response response = given()
                .when().log().all().get();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
    @Test
    public void kvParamsTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/users";
        Response response = given()
                .param("name","admin")
                .when().log().all().get();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
}
