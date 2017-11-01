package com.PF.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonmFunctions extends StaticVariables {

	/********* enter text into Edit box **************/
	public void sendkeys(WebElement element, String inputdata) {
		try {
			//element.clear();
			element.sendKeys(inputdata);
		} catch (Exception e) {
			System.out.println("Error in description: " + e.getStackTrace());
		}

	}

	/********** Click on button/checkbox/radiobutton/link **********/
	public void click(WebElement element) {
		element.click();
	}

}
