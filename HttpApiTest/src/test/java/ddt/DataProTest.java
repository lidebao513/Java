package ddt;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tools.ExcelUtils;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/11/23.
 */
public class DataProTest {
    @DataProvider
    public Object[][] createData1() {
        return new Object[][] {
                { "admin1", "admin1" },
                { "admin2", "admin2"},
                { "admin3", "admin3"},
        };
    }

    @Test(dataProvider ="createData1")
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
    @DataProvider
    public Object[][] excelData() throws Exception {
        String filePath = "D:\\quanhao\\D\\project\\HttpApiTest\\src\\main\\resources\\data\\testData.xls";
        String sheetName = "sheet1";
        Object test[][] = ExcelUtils.getTableArray(filePath,sheetName);
        return test;
    }

    @Test(dataProvider ="excelData")
    public void jsonBodyExcelDataTest(String uri,String requestBody,String headerKey,String headerValue,String cookieKey,String cookieValue,String test){
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = uri;
        String jsonBody = requestBody;
        Response response = given()
                .header(headerKey,headerValue)
                .cookie(cookieKey,cookieValue)
                .body(jsonBody)
                .when().log().all().post();
        int responseCode = response.statusCode();
        response.getBody().print();
        System.out.println("响应状态码："+String.valueOf(responseCode));
        System.out.println(test);
    }
}
