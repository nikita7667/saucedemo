package com.Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {

	public static void main(String[] args) throws InterruptedException {

        // Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
        // Initialize a new ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		
        // Maximize the window
        driver.manage().window().maximize();

        // Navigate to the SauceDemo login page
	    driver.get("https://www.saucedemo.com/");
	    
        // Log in with valid credentials
	    driver.findElement(By.id("user-name"));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password"));
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		// Log in with valid credentials
        /*
        
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        
        usernameField.sendKeys("standard_user"); // Enter a valid username
        passwordField.sendKeys("secret_sauce"); // Enter the correct password
        loginButton.click(); // Click the login button 
        
        */
		
		
		// select Product
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		Thread.sleep(2000);

		// add to card
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);

		// checkout
        driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

        // checkout details
        driver.findElement(By.id("first-name"));
        driver.findElement(By.id("first-name")).sendKeys("Nikita");

        driver.findElement(By.id("last-name"));
        driver.findElement(By.id("last-name")).sendKeys("Chikhalthane");

        driver.findElement(By.id("postal-code"));
        driver.findElement(By.id("postal-code")).sendKeys("411019");
        
        driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

        driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

        driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		
		//Logout
		
		//menu
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();


        // Wait for a few seconds
       Thread.sleep(4000);
        
      // Close the browser
      driver.close();

		
		
	}

}
