package apis;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/19.
 */
public class Body {
    @Parameters({"username","password"})
    @Test(priority = 2)
    public void jsonBodyTest(String userName,String passWord){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/body";
        String jsonBody = "{\n" +
                "\tusername: "+userName+",\n" +
                "\tpassword: "+passWord+"\n" +
                "}";
        Response response = given()
                .body(jsonBody)
                .when().log().all().post();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
    @Test()
    public void formDataBodyTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/form-data";
        Response response = given()
                .formParam("fdk1","fdv1")
                .when().log().all().post();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
    @Test
    public void fileUploadBodyTest(){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/upload";
        Response response = given()
                .multiPart("uploaded_file",new File("D:\\upload_files\\bgt.png"))
                .when().log().all().post();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
    }
}
