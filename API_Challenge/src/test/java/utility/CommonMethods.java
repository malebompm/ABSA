package utility;

import io.restassured.path.json.JsonPath;

public class CommonMethods {
    public static JsonPath rawToJson(String responseBody){
        JsonPath js = new JsonPath(responseBody);
        return js;
    }

}
