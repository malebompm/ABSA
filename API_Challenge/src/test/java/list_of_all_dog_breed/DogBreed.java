package list_of_all_dog_breed;

import org.testng.annotations.Test;
import utility.Spec_Builder;
import utility.Verification;

import static io.restassured.RestAssured.given;

public class DogBreed {
    Spec_Builder specBuilder = new Spec_Builder();
    @Test
    public void getList() {
        String respBody = given(specBuilder.getRequestSpec()).
                when().get("breeds/list/all").
                then().spec(specBuilder.getResponseSpec()).extract().response().getBody().asString();
        Verification.flashResponseBody(respBody);
    }
}
