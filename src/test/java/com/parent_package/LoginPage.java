package com.parent_package;

import com.microsoft.playwright.Page;
import com.parent_package.utils.BrowserFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage extends BrowserFactory {
    Page page;
@BeforeTest
    public void initBrowser() throws Exception {
   page= openBrowser("chrome");

}
@Test
    public void launchLogin(){
    page.navigate("https://saucedemo.com");
}

@AfterTest
    public void tearDown(){
    page.close();
}
}
