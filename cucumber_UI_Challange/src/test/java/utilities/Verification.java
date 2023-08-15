package utilities;

import common.Base;
import org.openqa.selenium.NoAlertPresentException;
import page_object.FirstPagePom;

public class Verification extends Base {

    CommonMethods common = new CommonMethods();
    FirstPagePom fp = new FirstPagePom();

    //verify login page
    public boolean verify_admin(){
        boolean checks =false;
        if(driver.findElements(fp.firstName).size() != 0){
            checks=true;
        }
        else{
            checks=false;
        }

        return checks;
    }
}
