package tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;
import utils.TestData;

@Listeners(utils.TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = TestData.class)
    public void testLogin(String username, String password, String expected) {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        if (expected.equals("success")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
        } else {
            Assert.assertEquals(loginPage.getErrorMessage(), expected);
        }
    }

//    @Test
//    public void testValidLogin() {
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername("student");
//        loginPage.enterPassword("Password123");
//        loginPage.clickLogin();
//
//
//
//        // Later: add assertion
//        HomePage dashboardPage = new HomePage(driver);
//
//        Assert.assertTrue(
//                dashboardPage.isLoginSuccessful(),
//                "Login failed: URL did not match expected"
//        );
//
//    }
//
//    @Test
//    public void testInvalidUsername() {
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername("invalidUser");
//        loginPage.enterPassword("Password123");
//        loginPage.clickLogin();
//
//        String errorMessage = loginPage.getErrorMessage();
//        Assert.assertEquals(errorMessage.contains("username is invalid"), "Error message mismatch for invalid username");
//    }
//
//    @Test
//    public void testInvalidPassword() {
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername("student");
//        loginPage.enterPassword("WrongPassword");
//        loginPage.clickLogin();
//
//        String errorMessage = loginPage.getErrorMessage();
//        Assert.assertEquals(errorMessage.contains("password is invalid"), "Error message mismatch for invalid password");
//
//    }
//
//    @Test
//    public void testEmptyFields() {
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.enterUsername("");
//        loginPage.enterPassword("");
//        loginPage.clickLogin();
//
//        String errorMessage = loginPage.getErrorMessage();
//        Assert.assertEquals(errorMessage.contains("empty"), "Error message mismatch for empty fields");
//    }
}



