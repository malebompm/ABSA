package utility.extent_report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
    public static ExtentTest logger;
    public static ExtentReports report;

    public static void startTest(){
        report=new ExtentReports((System.getProperty("user.dir"))+"/target/test_results/TestResults.html",false);
    }

    public static void setReport(String testName){
        report.startTest(testName);
    }
    public static void setLogger(LogStatus logStatus, String details){
        logger.log(logStatus,details);
    }


    public static void endTest(){
        report.endTest(logger);
        report.flush();
        report.close();
    }

    public static ExtentTest getLogger() {
        return logger;
    }
    public static ExtentReports getReport() {
        return report;
    }

}
