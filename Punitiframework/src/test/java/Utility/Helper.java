package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public String captureScreenshot(WebDriver driver) {
		String path = System.getProperty("user.dir") + "/Screenshot/FB" + System.currentTimeMillis() + ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return path;

	}

	public void getCurrentDateAndTime() {

	}

	public void handleFrameUsingID() {

	}

	public void handleFrameUsingElement() {

	}

	public void getTextfromAlert() {

	}

	public void acceptAlert() {

	}

	public void switchWindows() {

	}

}
