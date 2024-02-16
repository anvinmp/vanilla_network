package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Vn_page;

public class Vn_test {
  
	WebDriver driver;
	String baseurl="https://www.vanillanetworks.co.in/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url() {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test1() throws InterruptedException, IOException {
		Vn_page vn=new Vn_page(driver);
				Thread.sleep(5000);		vn.logodisplay();		Thread.sleep(1000);		vn.logoclick();		vn.hoverhome();		Thread.sleep(1000);
		vn.homeclick();
		vn.learnmore();
		Thread.sleep(1000);
		vn.scroll();
		vn.scrolls();	
		vn.access();
		vn.accesses();
		vn.scroll();
		vn.scroll();
		vn.timeline1();
		vn.timeline2();
//		vn.scroll();
		vn.contactform();
		vn.webdevelopment();
		vn.appdevelopment();
		vn.systemadmin();
		vn.virtualmba();
		vn.aboutus();
		vn.careers_work();
		vn.careers_team();
		vn.careers_apply();
		vn.careers_current_vacancies();
		vn.careers_apply_now();
		vn.careers_online_interview();
		vn.contactus();
	}
}
