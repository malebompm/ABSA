package sub_breeds_for_retriever;

import io.restassured.path.json.JsonPath;
import list_of_all_dog_breed.DogBreed;
import org.testng.annotations.Test;
import utility.CommonMethods;
import utility.Spec_Builder;
import utility.Verification;

import static io.restassured.RestAssured.given;

public class Sub_Breed_Retriever {
    Spec_Builder specBuilder = new Spec_Builder();
    DogBreed dogs =new DogBreed();
    @Test
    public void subBreeds() {
        String dogs = given(specBuilder.getRequestSpec()).
                when().get("breeds/list/all").
                then().spec(specBuilder.getResponseSpec()).extract().response().getBody().asString();

        JsonPath js = CommonMethods.rawToJson(dogs);
        String testVal = js.getString("message.retriever");

        Verification.retrieve(testVal);

    }
}
