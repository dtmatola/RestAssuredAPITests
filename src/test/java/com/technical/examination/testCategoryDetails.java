package com.technical.examination;

import io.restassured.response.Response;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testCategoryDetails {

    private Response response;
    private Integer expectedStatusCode = 200;
    private String expectedStatusLine = "HTTP/1.1 200 OK";
    private String endpointURI = "https://api.tmsandbox.co.nz/v1/Categories/6329/Details.json?catalogue=false";

    @Test(priority=1)
    public void category_name_home_and_garden_exists() {
        String expectedCategoryName = "Home & garden";

        response = RestAssured.given().when().get(endpointURI);

        Integer statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();

        Assert.assertEquals(statusCode, expectedStatusCode);
        Assert.assertEquals(statusLine, expectedStatusLine);
        response.then()
            .assertThat().body("Name", equalTo(expectedCategoryName));
    }

    @Test(priority=2)
    public void category_can_relist_enabled() {
        Boolean expectedCanRelistFlag = true;

        response = RestAssured.given().when().get(endpointURI);

        Integer statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();

        Assert.assertEquals(statusCode, expectedStatusCode);
        Assert.assertEquals(statusLine, expectedStatusLine);
        response.then()
            .assertThat().body("CanRelist", equalTo(expectedCanRelistFlag));
    }

    @Test(priority=3)
    public void category_promotion_feature_with_correct_description_exists() {
        String expectedPromotionName = "Feature";
        String expectedPromotionDesc = "Better position in category";

        response = RestAssured.given().when().get(endpointURI);

        Integer statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();

        Assert.assertEquals(statusCode, expectedStatusCode);
        Assert.assertEquals(statusLine, expectedStatusLine);
        response.then()
            .assertThat().body("Promotions",
                        hasItem(both(hasEntry("Name", expectedPromotionName))
                                .and(hasEntry("Description", expectedPromotionDesc))));
    }
}