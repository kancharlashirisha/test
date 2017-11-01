package com.PF.ProjetCommonFunctions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.PF.ObjectRepository.FB_Objects;
import com.PF.Utilities.CommonmFunctions;
import com.PF.Utilities.StaticVariables;

public class PageCommonFunctions extends StaticVariables {
	public FB_Objects fb;
	public CommonmFunctions cfn;
	

	public PageCommonFunctions(){
		cfn = new CommonmFunctions();
		fb = PageFactory.initElements(driver, FB_Objects.class);
		
	}

	public void fblogin(){
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		cfn.sendkeys(fb.Email_Editbox, "sddsf@gsdg.com");
		cfn.sendkeys(fb.Password_Editbox, "asdfdasf");
		cfn.click(fb.Login_Button);

	}

}
