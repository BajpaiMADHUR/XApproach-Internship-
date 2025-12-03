package com.x22;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.*;
public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://xapproach.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[2]/input")).sendKeys("madhurbajpai015@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[3]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/div[4]/div/input")).sendKeys("Madhuruchi@2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/form/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"home-content\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]")).click();
		
		
		
		
		
		




		//driver.close();
	}
}
