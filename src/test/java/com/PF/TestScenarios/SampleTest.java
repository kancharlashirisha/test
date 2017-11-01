package com.PF.TestScenarios;

import org.testng.annotations.Test;

import com.PF.ObjectRepository.FB_Objects;
import com.PF.ProjetCommonFunctions.PageCommonFunctions;
import com.PF.Utilities.CommonmFunctions;
import com.PF.Utilities.StaticVariables;

import org.testng.annotations.AfterMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class SampleTest extends StaticVariables{
	
	public PageCommonFunctions pc;
	
  @Test
  public void fblog() throws IOException {
	  pc = new PageCommonFunctions();
	  pc.fblogin();  
	  
  }
  
  
}
