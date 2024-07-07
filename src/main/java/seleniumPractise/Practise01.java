package seleniumPractise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise01 {

	
	public static void main(String[] args) {
		
		String browser = "Firefox";
		
		switch(browser){		
			case "Chrome" :
				new ChromeDriver();
				break;
			case "Firefox" :
				new FirefoxDriver();
				break;
				
		}

	}

}
