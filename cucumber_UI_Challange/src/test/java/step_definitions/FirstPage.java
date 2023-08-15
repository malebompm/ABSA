package step_definitions;

import common.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import utilities.Verification;

public class FirstPage extends Base {
    Verification vr = new Verification();
    @Given("User is on the admin page")
    public void user_is_on_the_admin_page() {

    }
    @Then("User must see the amin page")
    public void user_must_see_the_amin_page() {
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        Assert.assertTrue(vr.verify_admin());
    }

}
