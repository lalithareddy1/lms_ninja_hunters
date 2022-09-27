package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
		{"src/test/resources/features/Feature1loginfeature", 
		"src/test/resources/features/Feature2homefeatures",
		"src/test/resources/features/Feature3programfeatures",
		"src/test/resources/features/Feature4assignmentfeatures",
		"src/test/resources/features/Feature5userfeatures",
		"src/test/resources/features/Feature6batchfeatures",
		"src/test/resources/features/logoutfeature",
				
		},
glue = {"stepdefinitions"}, 
tags = "@login or @home_title or @home_heading or @home_btn or  "
		+ "@pgm_heading or @pgm_footer or @pgm_deletebtn or @pgm_records or @pgm_search or @pgm_edit or @pgm_delete or @addpgm or @multi_delete or @pagination or @asc_orderresults or @desc_orderresults"
		+ "@assign_heading or @assign_footer or @assign_search or @assign_new or @assign_edit or "
		+ "@user_manage or @user_pageHeading or @user_pagination or @user_footer or @add_newUser or @user_header or @logout" , 

//tags = "@login or @user_manage or @user_pageHeading or @user_pagination or @user_footer  or @add_newUser or @user_header",

plugin = { "pretty",
		    //"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
			"html:target/HtmlReports",
			"json:target/JSONReports/reports.json", 
			"junit:target/JUNITReorts/report.xml" ,
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
monochrome = true

)
public class TestRunner {

}
//@registrationHeading or @registrationLogin or @registrationSignup or @registration or 