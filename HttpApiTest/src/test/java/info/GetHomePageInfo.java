package info;

import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import tools.ApiTool;

/**
 * Created by Chuckie on 2017/12/10.
 */
public class GetHomePageInfo {
    @Test
    public void getAppHomePage(){
        String url = "http://localhost:4567/app/homepage" ;
        Response response = ApiTool.appGet(url);
        response.getBody().print();
    }
    @Test
    public void getWebHomePage(){
        String url = "http://localhost:4567/web/homepage" ;
        Response response = ApiTool.webGet(url);
        response.getBody().print();
    }
}
