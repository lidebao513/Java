package demo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/12.
 */
public class DeleteDemo {
    public void Delete(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/user/admin";
        Response response = given()
                .header("Content-Type","text/html;charset=utf8")
                .when().log().all().delete();
        int responseCode = response.statusCode();
        String responseContent = response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
        System.out.println(responseContent);
    }
    public static void main(String args[]){
        DeleteDemo dd = new DeleteDemo();
        dd.Delete();
    }
}
