package parse;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/12/10.
 */
public class responseCookie {
    @Test(groups = { "smoke" })
    public void responseCookieTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/web/login";
        String body="{\n" +
                "    \tusername:\"admin\",\n" +
                "    \tpassword:\"admin\"\n" +
                "}";
        Response response = given()
                .body(body)
                .when().log().all().post();
        int responseCode = response.statusCode();
        System.out.println("响应状态码："+String.valueOf(responseCode));
        String responseCookie = response.getCookie("JSESSIONID");
        System.out.println("响应状cookie JSESSIONID："+responseCookie);
    }
}
