package utils;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                {ConfigReader.get("validUsername"), ConfigReader.get("validPassword"), "success"},
                {"invalidUser", "Password123", "Your username is invalid!"},
                {"student", "WrongPassword", "Your password is invalid!"},
                {"", "", "Your username is invalid!"}
        };
    }
}
