package utils;

import com.aventstack.extentreports.*;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        test.info("Test Started");
        test.info("Entering email");
        test.info("Clicking login button");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        test.fail("Test Failed");
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        extent.flush();
    }
}