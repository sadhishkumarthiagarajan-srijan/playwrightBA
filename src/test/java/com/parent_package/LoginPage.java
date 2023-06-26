package com.parent_package;

import com.microsoft.playwright.Page;
import com.parent_package.utils.Baseclass;
import com.parent_package.utils.BrowserFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginPage extends BrowserFactory {
    Page page;
    Baseclass baseclass=new Baseclass();
    HashMap<String,String> testData=new HashMap<>();

@BeforeTest
    public void initBrowser() throws Exception {
    page= openBrowser("chrome");
    testData=baseclass.getTestData(getClass().getSimpleName());

}
@Test
    public void launchLogin(){
    page.navigate(testData.get("url"));
}

@AfterTest
    public void tearDown(){
    page.close();
}
}
