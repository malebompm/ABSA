package page_object;

import org.openqa.selenium.By;

public class AddUserPom {
    public By addUserButton = By.xpath("/html/body/table/thead/tr[2]/td/button");
    public By firstName = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input");
    public By lastName = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input");
    public By userName = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input");
    public By password = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input");
    public By compA = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]");
    public By compB = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/label[2]");
    public By email = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input");
    public By cellPhone = By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input");
    public By saveButton = By.xpath("/html/body/div[2]/div[3]/button[2]");

}
