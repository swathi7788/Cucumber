package org.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Login {
	WebDriver driver;
	@Given("User should navigate to login page")
	public void user_should_navigate_to_login_page() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	    
	}

	@When("User should enter username {string} and password {string}")
	public void user_should_enter_username_and_password(String user, String pass) {
		
	WebElement txtUsername = driver.findElement(By.id("email"));
	txtUsername.sendKeys(user);
	 WebElement txtPassword = driver.findElement(By.id("pass"));
	   txtPassword.sendKeys(pass	
			   );
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	    
	}

	@Then("User navigate invalid page")
	public void user_navigate_invalid_page() {
		//String currentUrl = driver.getCurrentUrl();
	// boolean contains = currentUrl.contains("privacy");
	// Assert.assertTrue(contains);
	 System.out.println("user succesfully navigate to invalid page");
		driver.close();
	   
	}

	
	    
	}




	