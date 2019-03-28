package parse;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.jayway.restassured.RestAssured.given;

/**
 * Created by Chuckie on 2017/12/10.
 */
public class responseBody {
    @Test(groups = { "P0" })
    public void singleJsonTest() {
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/json/single";
        Response response = given()
                .when().log().all().get();
        int responseCode = response.statusCode();
        Assert.assertEquals(responseCode,200,"状态码和预期值不相等！");
        System.out.println("响应状态码：" + String.valueOf(responseCode));
        JsonPath jsonPath = response.jsonPath();
        String nameValue = jsonPath.get("name");
        Assert.assertEquals(nameValue,"admin","name value和预期值不相等！");
        System.out.println("name value：" + nameValue);
    }
    @Test
    public void multiJsonTest() {
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/json/multi";
        Response response = given()
                .when().log().all().get();
        int responseCode = response.statusCode();
        System.out.println("响应状态码：" + String.valueOf(responseCode));
        JsonPath jsonPath = response.jsonPath();
        int lottoIdValue = jsonPath.get("lotto.lottoId");
        System.out.println("lottoId value：" + lottoIdValue);
    }
    @Test(groups = { "P0" ,"smoke" })
    public void multiJsonArrayTest() {
        RestAssured.baseURI = "http://localhost:4567";
        RestAssured.basePath = "/json/multi";
        Response response = given()
                .when().log().all().get();
        int responseCode = response.statusCode();
        System.out.println("响应状态码：" + String.valueOf(responseCode));
        JsonPath jsonPath = response.jsonPath();
        int winnerIdValue = jsonPath.get("lotto.winners[0].winnerId");
        System.out.println("winnerId value：" + winnerIdValue);
    }
}
