package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class BookResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
                .formParam("title", "the life of Pablo Endara")
                .formParam("author", "Pablo Endara")
                .formParam("year", 2021)
                .formParam("genre", "Biography")
                .when().post("/api/books")
          .then()
             .statusCode(201);
    }

}