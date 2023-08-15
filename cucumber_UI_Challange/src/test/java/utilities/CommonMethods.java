package utilities;

import common.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class CommonMethods extends Base {

    //Wait for element to be present
    public void wait_for_element_to_be_present(By elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    //Handle Alert
    public Alert alerts() throws NoAlertPresentException{
        Alert alert = driver.switchTo().alert();
        return alert;
    }

    //Handle Table
    public boolean look_for_value_in_a_table(String username){
        //No.of rows
        List<WebElement> col = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
        System.out.println("No of cols are : " +col.size());
        //No.of rows
        List <WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        System.out.println("No of rows are : " + rows.size());

        boolean found = false;
        //loop through the rows
        for(int x=0;x< rows.size();x++){
           if(username.equalsIgnoreCase(col.get(x).getText())){
               found = true;
               break;
           }
        }
         return found;

    }

    //Handle dropdown menu
    public void drop_down_menu(String selectValue){
        Select select = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select")));
        select.selectByVisibleText(selectValue);
    }


}
