package services;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ShowBookingWithID  {

    @Test
    public void ShowBooking(String bookingID){

        given().log().all().header("Accept","application/json")
                .get("https://restful-booker.herokuapp.com/booking/{bookingID}", bookingID)
                .then()
                .log().all()
                .statusCode(200);



    }
}
