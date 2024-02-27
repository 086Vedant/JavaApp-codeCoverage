package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class CalculatorTest {

    @Test
    public void testAddEndpoint() {
        given()
          .queryParam("a", 5)
          .queryParam("b", 3)
          .when().get("/calculator/add")
          .then()
             .statusCode(200)
             .contentType(ContentType.TEXT)
             .body(equalTo("8"));
    }

    @Test
    public void testSubtractEndpoint() {
        given()
          .queryParam("a", 10)
          .queryParam("b", 4)
          .when().get("/calculator/subtract")
          .then()
             .statusCode(200)
             .contentType(ContentType.TEXT)
             .body(equalTo("6"));
    }

    @Test
    public void testMultiplyEndpoint() {
        given()
          .queryParam("a", 7)
          .queryParam("b", 5)
          .when().get("/calculator/multiply")
          .then()
             .statusCode(200)
             .contentType(ContentType.TEXT)
             .body(equalTo("35"));
    }

    @Test
    public void testDivideEndpoint() {
        given()
          .queryParam("a", 20)
          .queryParam("b", 4)
          .when().get("/calculator/divide")
          .then()
             .statusCode(200)
             .contentType(ContentType.TEXT)
             .body(equalTo("5"));
    }
}
