package step_definitions;

import common.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page_object.AddUserPom;
import utilities.CommonMethods;

import java.time.Duration;
import java.util.*;

public class AddUser extends Base {
    AddUserPom as = new AddUserPom();
    CommonMethods cm = new CommonMethods();
    String username;
    @When("User enters user info {string},{string},{string}, {string}, {string}, {string},{string},{string}")
    public void user_enters_user_info(String name,String lname, String uname, String password, String customer, String role, String email, String cellNo) {
        // Instance of random class
        Random rand = new Random();
        // random numbers in specific range
        int upperbound = 25;
        int int_random = rand.nextInt(upperbound);

        //List<List<String>> cells = dataTable.cells();
        cm.wait_for_element_to_be_present(as.addUserButton);
        driver.findElement(as.addUserButton).click();
        driver.findElement(as.firstName).clear();
        driver.findElement(as.firstName).sendKeys(name);
        driver.findElement(as.lastName).clear();
        driver.findElement(as.lastName).sendKeys(lname);
        driver.findElement(as.userName).clear();
        driver.findElement(as.userName).sendKeys(uname + int_random);
        username = uname + int_random;
        driver.findElement(as.password).clear();
        driver.findElement(as.password).sendKeys(password);
        if (customer.equalsIgnoreCase("Company AAA")) {
            driver.findElement(as.compA).click();
        } else {
            driver.findElement(as.compB).click();
        }
        cm.drop_down_menu(role);
        driver.findElement(as.email).clear();
        driver.findElement(as.email).sendKeys(email);
        driver.findElement(as.cellPhone).clear();
        driver.findElement(as.cellPhone).sendKeys(cellNo);

        driver.findElement(as.saveButton).click();
    }

    @Then("Ensure that your users are added to the list")
    public void ensure_that_your_users_are_added_to_the_list() {
        Assert.assertTrue(cm.look_for_value_in_a_table(username));
    }


}
