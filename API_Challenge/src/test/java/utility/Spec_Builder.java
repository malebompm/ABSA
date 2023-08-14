package utility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder {

    public static RequestSpecification getRequestSpec(){
        return new RequestSpecBuilder().setBaseUri("https://dog.ceo/api").
                log(LogDetail.ALL).
                build();
    }

    public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().expectStatusCode(200).
                log(LogDetail.ALL).
                build();
    }
}
