package operation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	public static void click(By locator ) {
		Base.driver.findElement(locator).click();
	}
	
	public static void enterText(By locator , String text) throws InterruptedException {
		waitElementVisible(locator);
		Base.driver.findElement(locator).clear();
		Base.driver.findElement(locator).sendKeys(text);
	}
	
	public static void waitElementVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(Base.driver, 60);
		wait.until(ExpectedConditions.visibilityOf(Base.driver.findElement(locator)));
	}

}
