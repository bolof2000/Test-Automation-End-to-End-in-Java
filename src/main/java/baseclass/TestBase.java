package baseclass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

    /*
    Parent class to all test cases
    the following will be initialize in the base class

     Webdriver
     Properties
     logs
     ExtentReports
     DB
     Excel
     Mail


     */

    @BeforeSuite
    public void setUp(){


    }



    @AfterSuite
    public void tearDown(){


    }


}
