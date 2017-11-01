package com.PF.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FB_Objects {
	
	@FindBy(xpath=".//*[@id='email']")
	public WebElement Email_Editbox;
	
	@FindBy(id="pass")
	public WebElement Password_Editbox;
	
	@FindBy(xpath=".//*[@id='u_0_2']")
	public WebElement Login_Button;
}
