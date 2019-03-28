package demo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/12.
 */
public class PostDemo {
    public void Post(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/login/test";
        Response response = given()
                .header("Content-Type","text/html;charset=utf8")
                .when().log().all().post();
        int responseCode = response.statusCode();
        String responseContent = response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
        System.out.println(responseContent);
    }
    public static void main(String args[]){
        PostDemo pd = new PostDemo();
        pd.Post();
    }
}
