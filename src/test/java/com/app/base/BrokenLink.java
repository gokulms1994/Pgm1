package com.app.base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink extends BaseClass {
	
	public static WebDriver driver;
	public static void  brokenlink() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		for(WebElement l: link) {
			String url=l.getAttribute("href");
			System.out.println(url);
			try {
				URL u= new URL(url);
				HttpURLConnection httpurl=(HttpURLConnection)u.openConnection();
				httpurl.connect();
				if(httpurl.getResponseCode()>=400) {
					System.out.println(url + " "+httpurl.getResponseMessage());
				}else {
					System.out.println(url + " "+httpurl.getResponseMessage());
				}
			} catch (MalformedURLException e) {
				
			} catch (IOException e) {
				
			}
			
		}
		//System.out.println(url);
		
		
	}
	public static void  frame() {
		double a=11234.5d;
		int b=(int)a;
		System.out.println(b);
		
		
	}
	public static void frames() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement click=driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		click.click();
		WebElement frames=driver.findElement(By.xpath("(//h5[text()='iFrame Demo'])[1]"));
		driver.switchTo().frame(frames);
		WebElement username=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		username.sendKeys("123");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	}
	
	public static void main(String[]args) {
		//brokenlink();
		//frame();
		frames();
	}
}
