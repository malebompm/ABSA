package verify_retrieve_is_within_list;

import io.restassured.path.json.JsonPath;
import list_of_all_dog_breed.DogBreed;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import utility.CommonMethods;
import utility.Spec_Builder;
import utility.Verification;

import static io.restassured.RestAssured.given;

public class Retrieve {
    Spec_Builder specBuilder = new Spec_Builder();
    DogBreed dogs =new DogBreed();
    @Test
    public void retrieving() {
        String dogs = given(specBuilder.getRequestSpec()).
                when().get("breeds/list/all").
                then().spec(specBuilder.getResponseSpec()).extract().response().getBody().asString();

        JsonPath js = CommonMethods.rawToJson(dogs);
        String testVal = js.getString("message");

        Verification.contains(testVal,"retriever");

    }
}
