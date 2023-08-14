package utility;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import utility.extent_report.ExtentReport;

public class Verification {
    ExtentReport er = new ExtentReport();
    //all common verification processes here
    public static void flashResponseBody(String response){
        ExtentReport.startTest();
        ExtentReport.logger = ExtentReport.report.startTest("Print a response body");
        if(response.contains("success")){
            ExtentReport.setLogger(LogStatus.PASS,response);
            ExtentReport.endTest();
        }else
        {
            ExtentReport.setLogger(LogStatus.FAIL,response);
            ExtentReport.endTest();
        }
    }
    public static void contains(String actualValue, String valueToCheck){
        boolean val;
        ExtentReport.startTest();
        ExtentReport.logger = ExtentReport.report.startTest("Using code, verify “retriever” breed is within the list");
        if(actualValue.contains(valueToCheck)){
            val = true;
            System.out.println(valueToCheck + " " + "is within the list");
            ExtentReport.setLogger(LogStatus.PASS,valueToCheck  + "is within the list");
        }else{
            val = false;
            ExtentReport.setLogger(LogStatus.FAIL,valueToCheck  + "is not within the list");
        }
        Assert.assertTrue(val);
        ExtentReport.endTest();
    }

    public static void retrieve(String val_to_retrieve){
        ExtentReport.startTest();
        ExtentReport.logger = ExtentReport.report.startTest("Produce a list of sub-breeds for “retriever”");
        if(val_to_retrieve.contains(",")){
            String []splitTheValue = val_to_retrieve.split(",");
            for(int x=0; x<splitTheValue.length;x++){

                System.out.println(splitTheValue[x]);
                ExtentReport.setLogger(LogStatus.PASS,splitTheValue[x]);
                ExtentReport.endTest();

            }
        }else{
           System.out.println(val_to_retrieve);
           ExtentReport.setLogger(LogStatus.PASS,val_to_retrieve);
           ExtentReport.endTest();
        }

    }


}
