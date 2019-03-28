package tools;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/12/10.
 */
public class ApiTool {
    public static String getAppToken(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/app/login";
        String body="{\n" +
                "    \tusername:\"admin\",\n" +
                "    \tpassword:\"admin\"\n" +
                "}";
        Response response = given()
                .body(body)
                .when().log().all().post();
        int responseCode = response.statusCode();
        System.out.println("响应状态码："+String.valueOf(responseCode));
        String token = response.getHeader("token");
        return token;
    }
    public static String getWebCookie(){
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
        String cookie = response.getCookie("JSESSIONID");
        return cookie;
    }
    public static Response appGet(String url){
        String token = ApiTool.getAppToken();
        Response response = given()
                .header("token",token)
                .when().log().all().get(url);
        return response;
    }
    public static Response webGet(String url){
        String cookie = ApiTool.getWebCookie();
        Response response = given()
                .cookie("JSESSIONID",cookie)
                .when().log().all().get(url);
        return response;
    }
}
