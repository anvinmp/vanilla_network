package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vn_page {
	WebDriver driver;
	
	//HOME PAGE
	By logo=By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[1]/a/img[2]");
	By home=By.xpath("//*[@id=\"header-menu\"]/ul/li[1]/a");
	By service=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[2]/a");
	By aboutus=By.xpath("//*[@id=\"header-menu\"]/ul/li[3]/a");
	By careers=By.xpath("//*[@id=\"header-menu\"]/ul/li[4]/a");
	By contactus=By.xpath("//*[@id=\"header-menu\"]/ul/li[5]/a");
	By learnmr=By.xpath("//*[@id=\"header\"]/div[2]/div[1]/div/div/div[2]/div/div/a");
	By customer=By.xpath("//*[@id=\"platform\"]/div[2]/div/div[1]/div/ul/li[1]/a");
	By jobseeker=By.xpath("/html/body/div[2]/main/section[3]/div[2]/div/div[1]/div/ul/li[3]/a");
	By timelinelt=By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div/div[2]/div[2]/button[1]");
	By timelinert=By.xpath("//*[@id=\"roadmap\"]/div[2]/div/div/div[2]/div[2]/button[2]");
	By name=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[1]/div[1]/input");
	By businessname=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[1]/div[2]/input");
	By businessemail=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[2]/div/input");
	By phone=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[3]/div/div/div[2]/input");
	By subject=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[4]/div/input");
	By message=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[5]/div/textarea");
	By send=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[7]/div/button");
	By term=By.xpath("/html/body/div[2]/footer/div/div/div[1]/div[2]/div/ul/li[1]/a");
	By termclose=By.xpath("//*[@id=\"modal-terms\"]/div/div/a/em");
	By privacy=By.xpath("/html/body/div[2]/footer/div/div/div[1]/div[2]/div/ul/li[2]/a");
	By privacyclose=By.xpath("//*[@id=\"modal-privacy\"]/div/div/a/em");
	By policy=By.xpath("/html/body/div[2]/footer/div/div/div[1]/div[2]/div/ul/li[3]/a");
	By policyclose=By.xpath("//*[@id=\"modal-cookie\"]/div/div/a/em");
	
	//SERVICE PAGE//WEB DEVELOPMENT
	By web=By.xpath("//*[@id=\"header-menu\"]/ul/li[2]/ul/div/ul/li[1]/a");
	By weblearn1=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[1]/a");
	By weblearn2=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[2]/div[2]/ul/li[1]/a");
	By webcontact=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[2]/a");
	By webinquire1=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[2]/div[2]/ul/li[2]/a");
	By webphp=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[2]/a");
	By webpython=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[3]/a");
	By webnet=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[4]/a");
	By webdesign=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[5]/a");
	By webneed=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[6]/a");
	By webjava=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[1]/a");
	By webinquire2=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div/div[1]/div/div/div[2]/div[2]/ul/li/a");
	By webinquire3=By.xpath("/html/body/div[2]/main/section[3]/div/div[2]/div/div/div/div/div[2]/ul/li/a");
	By webcontacthr=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[2]/div/div/ul/li[2]/div/ul/li[2]/a");
	By contactname=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[1]/div[1]/input");		
	By contactbname=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[1]/div[2]/input");
	By contactbemail=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[2]/div/input");
	By contactphone=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[3]/div/div/div[2]/input");
	By contactsubject=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[4]/div/input");
	By contactmessage=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[5]/div/textarea");
	By contactsend=By.xpath("/html/body/div[2]/main/section[5]/div/div/div/div[1]/div/form/div[7]/div/button");
	
	By hrname=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[1]/div/input");
	By hremail=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[2]/div/input");
	By hrsubject=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[3]/div/input");
	By hrmessage=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[4]/div/textarea");
	By hrsend=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[6]/div/button");
	
	//SERVICE PAGE//MOBILE APP DEVELOPMENT
	By app=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[2]/ul/div/ul/li[2]/a");
	By appcontact=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[2]/a");
	By applearn1=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[1]/a");
	By appcross=By.xpath("/html/body/div[2]/main/section[1]/div/div/div[1]/div/ul/li[3]/a");
	By appprograssive=By.xpath("/html/body/div[2]/main/section[1]/div/div/div[1]/div/ul/li[5]/a");
	By appplateform=By.xpath("/html/body/div[2]/main/section[1]/div/div/div[1]/div/ul/li[1]/a");
	By appinquire1=By.xpath("/html/body/div[2]/main/section[3]/div/div[2]/div/div/div/div/div[2]/ul/li/a");
	
	//SERVICE PAGE//SYSTEM ADMIN
	By system=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[2]/ul/div/ul/li[3]/a");
	By systemlearn1=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[1]/a");
	By systemcontact=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[2]/a");
	By systemlearn2=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[2]/div[2]/ul/li[1]/a");
	By systemlinux=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[2]/a");
	By systemwindow=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[3]/a");
	By systemcloud=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[4]/a");
	By systemhost=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/ul/li[1]/a");
	By systeminquire1=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[2]/div[2]/ul/li[2]/a");
	By systeminquire2=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div/div[1]/div/div/div[1]/div/div/ul/li/a");
	By systeminquire3=By.xpath("/html/body/div[2]/main/section[4]/div/div[2]/div/div/div/div/div[2]/ul/li/a");

	//SERVICE PAGE//VIRTUAL MBA
	By virtual=By.xpath("/html/body/div[2]/header/div/div/div/div[3]/nav/ul/li[2]/ul/div/ul/li[4]/a");
	By virtuallearn1=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[1]/a");
	By virtualcontact=By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[3]/ul/li[2]/a");
	By virtualwhat=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/p[2]/a/span");
	By virtualinquire1=By.xpath("/html/body/div[2]/main/section[4]/div/div[2]/div/div/div/div/div[2]/ul/li/a");
	By faqcontact=By.xpath("/html/body/div[2]/main/section[5]/div/div/div[1]/div/p/a");
	By faq1=By.xpath("/html/body/div[2]/main/section[5]/div/div/div[2]/div/div[1]/h5/span");
	By faq2=By.xpath("/html/body/div[2]/main/section[5]/div/div/div[2]/div/div[2]/h5/span");
	By faq3=By.xpath("/html/body/div[2]/main/section[5]/div/div/div[2]/div/div[3]/h5/span");
	By faq4=By.xpath("/html/body/div[2]/main/section[5]/div/div/div[2]/div/div[4]/h5/span");
	
	//ABOUT PAGE//COMPANY PROFILE
	By company=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[3]/ul/div/ul/li[1]/a");
	By companymission=By.xpath("/html/body/div[2]/main/section[1]/div[1]/div/div/div[2]/div/a/span");
	By companyvalues=By.xpath("/html/body/div[2]/main/section[2]/div[2]/div/div/div[2]/div/p[2]/a/span");
	By companyhistory=By.xpath("/html/body/div[2]/main/section[3]/div/div/div/div[1]/div/p[4]/a/span");
	//ABOUT PAGE//FACILITIES
	By facilities=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[3]/ul/div/ul/li[2]/a");
	By facilitiesoffice=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[1]/div/a[1]/span");
	By facilitiescovid=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[1]/div/a[2]/span");
	//ABOUT PAGE//ADVANCED CORPORATE SUPPORT
	By advanced=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[3]/ul/div/ul/li[3]/a");
	By advancedback=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div[2]/div/a/span");
	
	//CAREERS PAGE//WORK WITH US
	By careerswork=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[1]/a");
	By careersjoin=By.xpath("/html/body/div[2]/main/section[1]/div[1]/div/div/div[1]/div/a[1]/span");
	By careersapply1=By.xpath("/html/body/div[2]/main/section[1]/div[1]/div/div/div[1]/div/a[2]/span");
	By careersexplore=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/a/span");
	By careerscovid=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/div/a/span");
	By careersapply2=By.xpath("/html/body/div[2]/main/section[5]/div[1]/div/div/div[1]/div/a/span");
	//CAREERS PAGE//OUR TEAM
	By team=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[2]/a");
	By teamgallery=By.xpath("/html/body/div[2]/main/section/div/div/div/div/div/div[3]/ul/li[1]/a");
	By teamapply=By.xpath("/html/body/div[2]/main/section/div/div/div/div/div/div[3]/ul/li[2]/a");
	By teamimg1=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[1]/a/img");
	By teamimg2=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[2]/a/img");
	By teamimg3=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[3]/a/img");
	By teamimg4=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[4]/a/img");
	By teamimg5=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[5]/a/img");
	By teamimg6=By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div[6]/a/img");
	By teamback=By.xpath("/html/body/div[2]/main/div[2]");
	//CAREERS PAGE//HOW TO APPLY
	By apply=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[3]/a");
	By applyprocess=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div/div/div[3]/ul/li[1]/a");
	By applytips=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div/div/div[3]/ul/li[2]/a");
	By applyfaq=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div/div/div[3]/ul/li[3]/a");
	By applygeneral=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/ul/li[1]/a");
	By applydeveloper=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/ul/li[2]/a");
	By applydesigner=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/ul/li[3]/a");
	By applysystem=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/ul/li[4]/a");
	By applymba=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[1]/ul/li[5]/a");
	By applyg1=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[1]/h5/span");
	By applyg2=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[2]/h5/span");
	By applyg3=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[3]/h5/span");
	By applyg4=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[4]/h5/span");
	By applyg5=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[5]/h5/span");
	By applyg6=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[6]/h5/span");
	By applyg7=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[7]/h5/span");
	By applyg8=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[8]/h5/span");
	By applyg9=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[1]/div/div[9]/h5/span");
	By applyd1=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[1]/h5/span");
	By applyd2=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[2]/h5/span");
	By applyd3=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[3]/h5/span");
	By applyd4=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[4]/h5/span");
	By applyd5=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[5]/h5/span");
	By applyd6=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[2]/div/div[6]/h5/span");
	By applydes1=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[3]/div/div[1]/h5/span");
	By applydes2=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[3]/div/div[2]/h5/span");
	By applydes3=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[3]/div/div[3]/h5/span");
	By applydes4=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[3]/div/div[4]/h5/span");;
	By applyad1=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[4]/div/div[1]/h5/span");
	By applyad2=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[4]/div/div[2]/h5/span");
	By applyad3=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[4]/div/div[3]/h5/span");
	By applyad4=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[4]/div/div[4]/h5/span");
	By applymba1=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[5]/div/div[1]/h5/span");
	By applymba2=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[5]/div/div[2]/h5/span");
	By applymba3=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[5]/div/div[3]/h5/span");
	By applymba4=By.xpath("/html/body/div[2]/main/section[4]/div/div/div/div[2]/div/div[5]/div/div[4]/h5/span");
	//CAREERS PAGE//CURRENT VACCANCIES
	By current=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[4]/a");
	By currentview=By.xpath("/html/body/div[2]/main/section[1]/div/div/div/div/div/div[3]/ul/li/a");
	By currentdevelop=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[1]/ul/li[1]/a");
	By currentdesign=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[1]/ul/li[2]/a");
	By currentadmin=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[1]/ul/li[3]/a");
	By currentcorporate=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[1]/ul/li[4]/a");
	By currentview1=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div");
	By currentview2=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div/div");
	By currentview3=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[3]/div[1]/div/div");
	By currentview4=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[4]/div[1]/div/div");
	By currentview5=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[5]/div[1]/div/div");
	By currentview6=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[1]/div/div[6]/div[1]/div/div");
	By currentview7=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div");
	By currentview8=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[3]/div/div/div[1]/div/div");
	By currentview9=By.xpath("/html/body/div[2]/main/section[2]/div/div/div/div[2]/div/div[5]/div/div/div[1]/div/div");
	//CAREERS PAGE//APPLY NOW
	By now=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[5]/a");
	By nowtype=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div/select");
	By nowtypeselect=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/div/select/option[6]");
	By nowname=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div/input");
	By nowemail=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/div/input");
	By nowphone=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/div/input");
	By nowyear=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/div/select");
	By nowyearselect=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[3]/div[1]/div/div/select/option[4]");
	By nowlocation=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div/select");
	By nowlocationselect=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[3]/div[2]/div/div/select/option[2]");
	By nowfile=By.id("C:\\Users\\LENOVO\\Desktop\\autoo_it");
	By nowsubmit=By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div/div/form/div[5]/div[2]/button");
	//CAREERS PAGE//ONLINE INTERVIEW
	By online=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[4]/ul/div/ul/li[6]/a");
	By onlineusername=By.xpath("/html/body/main/div/form/input[1]");
	By onlinepassword=By.xpath("/html/body/main/div/form/input[2]");
	By onlinelogin=By.xpath("/html/body/main/div/form/button");
	
	//CONTACT US PAGE//SALES
	By sales=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[5]/ul/div/ul/li[1]/a");
	By salesname=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[1]/div[1]/input");
	By salesbname=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[1]/div[2]/input");
	By salesemail=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[2]/div/input");
	By salesphone=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[3]/div/div/div[2]/input");
	By salessubject=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[4]/div/input");
	By salesmessage=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[5]/div/textarea");
	By salesend=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[7]/div/button");
	//CONTACT US PAGE//JOBSEEKER
	By job=By.xpath("/html/body/div[2]/header/div[1]/div/div/div[3]/nav/ul/li[5]/ul/div/ul/li[2]/a");
	By jobname=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[1]/div/input");
	By jobemail=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[2]/div/input");
	By jobsubject=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[3]/div/input");
	By jobmessage=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[4]/div/textarea");
	By jobsend=By.xpath("/html/body/div[2]/main/section/div/div/div/div[1]/div/form/div[6]/div/button");

	
	
	
	public Vn_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void logodisplay() {
		boolean vnlogo=driver.findElement(logo).isDisplayed();
		
		if(vnlogo == true) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
	}
	
	public void logoclick() {
		driver.findElement(logo).click();
	}
	
	public void hoverhome() throws InterruptedException {
		
	    Actions action=new Actions(driver);
	    
		WebElement e1=driver.findElement(home);
		action.moveToElement(e1).perform();
		Thread.sleep(1000);
		
		WebElement e2=driver.findElement(service);
		action.moveToElement(e2).perform();
		Thread.sleep(1000);
		
		WebElement e3=driver.findElement(aboutus);
		action.moveToElement(e3).perform();
		Thread.sleep(1000);
		
		WebElement e4=driver.findElement(careers);
		action.moveToElement(e4).perform();
		Thread.sleep(1000);
		
		WebElement e5=driver.findElement(contactus);
		action.moveToElement(e5).perform();	
		Thread.sleep(1000);
	}
	public void homeclick() {
		driver.findElement(home).click();
	}
	public void learnmore() {
		
		driver.findElement(learnmr).click();
	}
	public void scroll() {
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	public void scrolls() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)", "");
	}
	public void back() {
		driver.navigate().back();
	}
	public void accesses() throws InterruptedException {
		driver.findElement(customer).click();
		Thread.sleep(1000);
	}
	public void access() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(jobseeker).click();
		Thread.sleep(1000);
	}
	public void timeline1() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(timelinert).click();
		driver.findElement(timelinert).click();
	}
	public void timeline2() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(timelinelt).click();
		driver.findElement(timelinelt).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(1500);
	}
	public void contactform() throws InterruptedException {
		driver.findElement(name).sendKeys("Anvin m p");
		driver.findElement(businessname).sendKeys("Anvin m p");
		driver.findElement(businessemail).sendKeys("anvinmp117@gmail.com");
		driver.findElement(phone).sendKeys("9961563537");
		driver.findElement(subject).sendKeys("Java Developer Position");
		driver.findElement(message).sendKeys("I am writing to apply for the Java Developer position at vanilla network With expertise in Java development and experience in Selenium and manual testing, I believe I can contribute effectively to your team.");
		Thread.sleep(2000);
		driver.findElement(send).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1500);
		driver.findElement(term).click();
		Thread.sleep(1000);
		driver.findElement(termclose).click();
		Thread.sleep(1000);
		
		
		driver.findElement(privacy).click();
		Thread.sleep(1000);
		driver.findElement(privacyclose).click();
		Thread.sleep(1000);
		driver.findElement(policy).click();
		Thread.sleep(1000);
		driver.findElement(policyclose).click();
		Thread.sleep(1000);
	}
	public void webdevelopment() throws InterruptedException {
		driver.findElement(service).click();
		Thread.sleep(1500);
		driver.findElement(web).click();
		Thread.sleep(1500);
		driver.findElement(weblearn1).click();
		Thread.sleep(1500);
		driver.findElement(weblearn2).click();
		Thread.sleep(1500);
		driver.findElement(webphp).click();
		Thread.sleep(1500);
		driver.findElement(webpython).click();
		Thread.sleep(1500);
		driver.findElement(webnet).click();
		Thread.sleep(1500);
		driver.findElement(webdesign).click();
		Thread.sleep(1500);
		driver.findElement(webneed).click();
		Thread.sleep(1500);
		driver.findElement(webjava).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(1500);
		driver.findElement(webinquire2).click();
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-700)", "");
		Thread.sleep(1500);
		driver.findElement(webinquire3).click();
		Thread.sleep(2000);


		
		driver.findElement(contactname).sendKeys("Anvin m p");
		driver.findElement(contactbname).sendKeys("Anvin m p");
		driver.findElement(contactbemail).sendKeys("anvinmp117@gmail.com");
		driver.findElement(contactphone).sendKeys("9961563537");
		driver.findElement(contactsubject).sendKeys("java developer position");
		driver.findElement(contactmessage).sendKeys("I am writing to apply for the Java Developer position at vanilla network With expertise in Java development and experience in Selenium and manual testing, I believe I can contribute effectively to your team");
		Thread.sleep(3000);
		driver.findElement(contactsend).click();
		Thread.sleep(1000);
		driver.findElement(webcontacthr).click();
		Thread.sleep(2000);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(hrname).sendKeys("Anvin m p");
		driver.findElement(hremail).sendKeys("anvinmp117@gmail.com");
		driver.findElement(hrsubject).sendKeys("java developer position");
		driver.findElement(hrmessage).sendKeys("I am writing to apply for the Java Developer position at vanilla network With expertise in Java development and experience in Selenium and manual testing, I believe I can contribute effectively to your team");
		Thread.sleep(3000);
		driver.findElement(hrsend).click();
	}
	public void appdevelopment() throws InterruptedException {
		driver.findElement(service).click();
		Thread.sleep(1500);
		driver.findElement(app).click();
		Thread.sleep(1500);
		driver.findElement(appcontact).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		driver.findElement(applearn1).click();
		Thread.sleep(3000);
		driver.findElement(appcross).click();
		Thread.sleep(1000);
		driver.findElement(appprograssive).click();
		Thread.sleep(1000);
		driver.findElement(appplateform).click();
		Thread.sleep(1000);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.PAGE_DOWN).perform();
		act1.sendKeys(Keys.PAGE_DOWN).perform();
		act1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1500);
		driver.findElement(appinquire1).click();
		Thread.sleep(1500);
	}
	public void systemadmin() throws InterruptedException {
		driver.findElement(service).click();
		Thread.sleep(1500);
		driver.findElement(system).click();
		Thread.sleep(1500);
		driver.findElement(systemlearn1).click();
		Thread.sleep(1500);
		driver.findElement(systemlearn2).click();
		Thread.sleep(1500);
		driver.findElement(systemlinux).click();
		Thread.sleep(1500);
		driver.findElement(systemwindow).click();
		Thread.sleep(1500);
		driver.findElement(systemcloud).click();
		Thread.sleep(1500);
		driver.findElement(systemhost).click();
		Thread.sleep(1500);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		driver.findElement(systeminquire2).click();
		Thread.sleep(1500);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(1500);
		driver.findElement(systeminquire3).click();
		Thread.sleep(1500);
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.HOME).perform();
		Thread.sleep(1500);
		Actions act3=new Actions(driver);
		act3.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(systeminquire1).click();
		Thread.sleep(1500);	
	}
	public void virtualmba() throws InterruptedException {
		driver.findElement(service).click();
		Thread.sleep(1500);
		driver.findElement(virtual).click();
		Thread.sleep(1500);
		driver.findElement(virtuallearn1).click();
		Thread.sleep(1500);
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(virtualwhat).click();
		Thread.sleep(1500);
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(virtualinquire1).click();
		Thread.sleep(1500);
		Actions act3=new Actions(driver);
		act3.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		driver.findElement(faqcontact).click();
		Thread.sleep(2000);
		act3.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		driver.findElement(faq1).click();
		Thread.sleep(1500);
		driver.findElement(faq1).click();
		Thread.sleep(1500);
		driver.findElement(faq2).click();
		Thread.sleep(1500);
		driver.findElement(faq2).click();
		Thread.sleep(1500);
		driver.findElement(faq3).click();
		Thread.sleep(1500);
		driver.findElement(faq3).click();
		Thread.sleep(1500);
		driver.findElement(faq4).click();
		Thread.sleep(1500);
		driver.findElement(faq4).click();
		Thread.sleep(1500);
	}
	public void aboutus() throws InterruptedException {
		driver.findElement(aboutus).click();
		Thread.sleep(1500);
		driver.findElement(company).click();
		Thread.sleep(1500);
		driver.findElement(companymission).click();
		Thread.sleep(2000);
		driver.findElement(companyvalues).click();
		Thread.sleep(2000);
		driver.findElement(companyhistory).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(1500);
		driver.findElement(aboutus).click();
		Thread.sleep(1500);
		driver.findElement(facilities).click();
		Thread.sleep(1500);
		driver.findElement(facilitiesoffice).click();
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.HOME).perform();
		driver.findElement(facilitiescovid).click();
		Thread.sleep(2000);
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		driver.findElement(aboutus).click();
		Thread.sleep(2000);
		driver.findElement(advanced).click();
		Thread.sleep(1500);
		driver.findElement(advancedback).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
	}
	public void contactus() throws InterruptedException {
		driver.findElement(contactus).click();
		Thread.sleep(1500);
		driver.findElement(sales).click();
		Thread.sleep(1500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		driver.findElement(salesname).sendKeys("Anvin m p");
		driver.findElement(salesbname).sendKeys("Anvin m p");
		driver.findElement(salesemail).sendKeys("anvinmp117@gmail.com");
		driver.findElement(salesphone).sendKeys("9961563537");
		driver.findElement(salessubject).sendKeys("java developer position");
		driver.findElement(salesmessage).sendKeys("I am writing to apply for the Java Developer position at vanilla network With expertise in Java development and experience in Selenium and manual testing, I believe I can contribute effectively to your team");
		Thread.sleep(4000);
		driver.findElement(salesend).click();
		Thread.sleep(1500);
		driver.findElement(contactus).click();
		Thread.sleep(1500);
		driver.findElement(job).click();
		Thread.sleep(1500);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,180)", "");
		Thread.sleep(2000);
		driver.findElement(jobname).sendKeys("Anvin m p");
		driver.findElement(jobemail).sendKeys("anvinmp117@gmail.com");
		driver.findElement(jobsubject).sendKeys("java Developer position");
		driver.findElement(jobmessage).sendKeys("I am writing to apply for the Java Developer position at vanilla network With expertise in Java development and experience in Selenium and manual testing, I believe I can contribute effectively to your team");
		Thread.sleep(4000);
		driver.findElement(jobsend).click();
	}
	public void careers_work() throws InterruptedException {
		driver.findElement(careers).click();
		Thread.sleep(1500);
		driver.findElement(careerswork).click();
		Thread.sleep(1500);
		driver.findElement(careersjoin).click();
		Thread.sleep(1500);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		driver.findElement(careersexplore).click();
		Thread.sleep(1500);
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(2000);
		driver.findElement(careerscovid).click();
		Thread.sleep(1500);
		driver.findElement(careersapply2).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(2000);
		Actions act2= new Actions(driver);
		act2.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		driver.findElement(careersapply1).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(2000);
	}
		public void careers_team() throws InterruptedException {
		driver.findElement(careers).click();
		Thread.sleep(2000);
		driver.findElement(team).click();
		Thread.sleep(2000);
		driver.findElement(teamgallery).click();
		Thread.sleep(2000);
		driver.findElement(teamimg1).click();
		Thread.sleep(5000);	
	}
		public void careers_apply() throws InterruptedException {
			driver.findElement(careers).click();
			Thread.sleep(2000);
			driver.findElement(apply).click();
			Thread.sleep(2000);
			driver.findElement(applyprocess).click();
			Thread.sleep(2000);
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-400)", "");
			Thread.sleep(2000);
			driver.findElement(applytips).click();
			Thread.sleep(2000);
			JavascriptExecutor js2=(JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,-800)", "");
			Thread.sleep(2000);
			driver.findElement(applyfaq).click();
			Thread.sleep(1500);
			driver.findElement(applygeneral).click();
			Thread.sleep(2000);
			driver.findElement(applyg1).click();
			Thread.sleep(1500);
			driver.findElement(applyg1).click();
			Thread.sleep(1500);
			driver.findElement(applyg2).click();
			Thread.sleep(1500);
			driver.findElement(applyg2).click();
			Thread.sleep(1500);
			driver.findElement(applyg3).click();
			Thread.sleep(1500);
			driver.findElement(applyg3).click();
			Thread.sleep(1500);
			driver.findElement(applyg4).click();
			Thread.sleep(1500);
			driver.findElement(applyg4).click();
			Thread.sleep(1500);
			JavascriptExecutor js3=(JavascriptExecutor) driver;
			js3.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(2000);
			driver.findElement(applyg5).click();
			Thread.sleep(1500);
			driver.findElement(applyg5).click();
			Thread.sleep(1500);
			driver.findElement(applyg6).click();
			Thread.sleep(1500);
			driver.findElement(applyg6).click();
			Thread.sleep(1500);
			driver.findElement(applyg7).click();
			Thread.sleep(1500);
			driver.findElement(applyg7).click();
			Thread.sleep(1500);
			driver.findElement(applyg8).click();
			Thread.sleep(1500);
			driver.findElement(applyg8).click();
			Thread.sleep(1500);
			driver.findElement(applyg9).click();
			Thread.sleep(1500);
			driver.findElement(applyg9).click();
			Thread.sleep(1500);
			JavascriptExecutor js4=(JavascriptExecutor) driver;
			js4.executeScript("window.scrollBy(0,-400)", "");
			Thread.sleep(2000);
			driver.findElement(applydeveloper).click();
			Thread.sleep(1500);
			driver.findElement(applyd1).click();
			Thread.sleep(1000);
			driver.findElement(applyd1).click();
			Thread.sleep(1000);
			driver.findElement(applyd2).click();
			Thread.sleep(1000);
			driver.findElement(applyd2).click();
			Thread.sleep(1000);
			driver.findElement(applyd3).click();
			Thread.sleep(1000);
			driver.findElement(applyd3).click();
			Thread.sleep(1000);
			driver.findElement(applyd4).click();
			Thread.sleep(1000);
			driver.findElement(applyd4).click();
			Thread.sleep(1000);
			driver.findElement(applyd5).click();
			Thread.sleep(1000);
			driver.findElement(applyd5).click();
			Thread.sleep(1000);
			driver.findElement(applyd6).click();
			Thread.sleep(1000);
			driver.findElement(applyd6).click();
			Thread.sleep(1000);
			driver.findElement(applydesigner).click();
			Thread.sleep(1000);
			driver.findElement(applydes1).click();
			Thread.sleep(1000);
			driver.findElement(applydes1).click();
			Thread.sleep(1000);
			driver.findElement(applydes2).click();
			Thread.sleep(1000);
			driver.findElement(applydes2).click();
			Thread.sleep(1000);
			driver.findElement(applydes3).click();
			Thread.sleep(1000);
			driver.findElement(applydes3).click();
			Thread.sleep(1000);
			driver.findElement(applydes4).click();
			Thread.sleep(1000);
			driver.findElement(applydes4).click();
			Thread.sleep(1000);
			driver.findElement(applysystem).click();
			Thread.sleep(1000);
			driver.findElement(applyad1).click();
			Thread.sleep(1000);
			driver.findElement(applyad1).click();
			Thread.sleep(1000);
			driver.findElement(applyad2).click();
			Thread.sleep(1000);
			driver.findElement(applyad2).click();
			Thread.sleep(1000);
			driver.findElement(applyad3).click();
			Thread.sleep(1000);
			driver.findElement(applyad3).click();
			Thread.sleep(1000);
			driver.findElement(applyad4).click();
			Thread.sleep(1000);
			driver.findElement(applyad4).click();
			Thread.sleep(1000);
			driver.findElement(applymba).click();
			Thread.sleep(1000);
			driver.findElement(applymba1).click();
			Thread.sleep(1000);
			driver.findElement(applymba1).click();
			Thread.sleep(1000);
			driver.findElement(applymba2).click();
			Thread.sleep(1000);
			driver.findElement(applymba2).click();
			Thread.sleep(1000);
			driver.findElement(applymba3).click();
			Thread.sleep(1000);
			driver.findElement(applymba3).click();
			Thread.sleep(1000);
			driver.findElement(applymba4).click();
			Thread.sleep(1000);
			driver.findElement(applymba4).click();
			Thread.sleep(1000);
		}
		public void careers_current_vacancies() throws InterruptedException {
			driver.findElement(careers).click();
			Thread.sleep(2000);
			driver.findElement(current).click();
			Thread.sleep(1000);
			driver.findElement(currentview).click();
			Thread.sleep(1000);
			driver.findElement(currentdevelop).click();
			Thread.sleep(1000);
			driver.findElement(currentview1).click();
			Thread.sleep(1000);
			driver.findElement(currentview1).click();
			Thread.sleep(1000);
			driver.findElement(currentview2).click();
			Thread.sleep(1000);
			driver.findElement(currentview2).click();
			Thread.sleep(1000);
			driver.findElement(currentview3).click();
			Thread.sleep(1000);
			driver.findElement(currentview3).click();
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(2000);
			driver.findElement(currentview4).click();
			Thread.sleep(1000);
			driver.findElement(currentview4).click();
			Thread.sleep(1000);
			driver.findElement(currentview5).click();
			Thread.sleep(1000);
			driver.findElement(currentview5).click();
			Thread.sleep(1000);
			driver.findElement(currentview6).click();
			Thread.sleep(1000);
			driver.findElement(currentview6).click();
			Thread.sleep(1000);
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-300)", "");
			Thread.sleep(2000);
			driver.findElement(currentdesign).click();
			Thread.sleep(1000);
			driver.findElement(currentview7).click();
			Thread.sleep(1000);
			driver.findElement(currentview7).click();
			Thread.sleep(1000);
			driver.findElement(currentadmin).click();
			Thread.sleep(1000);
			driver.findElement(currentview8).click();
			Thread.sleep(1000);
			driver.findElement(currentview8).click();
			Thread.sleep(1000);
			driver.findElement(currentcorporate).click();
			Thread.sleep(1000);
			driver.findElement(currentview9).click();
			Thread.sleep(1000);
			driver.findElement(currentview9).click();
			Thread.sleep(1000);	
		}
		public void careers_apply_now() throws InterruptedException, IOException {
			driver.findElement(careers).click();
			Thread.sleep(2000);
			driver.findElement(now).click();
			Thread.sleep(1000);
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(2000);
			driver.findElement(nowtype).click();
			Thread.sleep(2500);
			driver.findElement(nowtypeselect).click();
			Thread.sleep(3000);
			driver.findElement(nowtype).click();
			Thread.sleep(2500);
			driver.findElement(nowname).sendKeys("Anvin m p");
			Thread.sleep(2000);
			driver.findElement(nowemail).sendKeys("anvinmp117@gmail.com");
			Thread.sleep(2000);
			driver.findElement(nowphone).sendKeys("9961563537");
			Thread.sleep(2000);
			driver.findElement(nowyear).click();
			Thread.sleep(2500);
			driver.findElement(nowyearselect).click();
			Thread.sleep(3000);
			driver.findElement(nowyear).click();
			Thread.sleep(2500);
			driver.findElement(nowlocation).click();
			Thread.sleep(2500);
			driver.findElement(nowlocationselect).click();
			Thread.sleep(3000);
			driver.findElement(nowlocation).click();
			Thread.sleep(3000);
		
			Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Desktop\\autoo_it\\aa.exe");
			Thread.sleep(4000);
			driver.findElement(nowsubmit).click();
			Thread.sleep(2500);	
		}
		public void careers_online_interview() throws InterruptedException {
			driver.findElement(careers).click();
			Thread.sleep(2000);
			driver.findElement(online).click();
			Thread.sleep(1000);
			driver.findElement(onlineusername).sendKeys("anvinmp");
			Thread.sleep(1500);
			driver.findElement(onlinepassword).sendKeys("123456789");
			Thread.sleep(1500);
			driver.findElement(onlinelogin).click();
			Thread.sleep(4000);
			driver.navigate().back();
		}
		
		
		
		
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	

