package Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProviderFactory {

	Properties pro;

	public ConfigProviderFactory() {

		try {
			FileInputStream fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "/Config/projectconfigfile.properties"));
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
	public String getValue(String key)
	{
		return pro.getProperty(key);
	}
	
	public String getURL()
	{
		return pro.getProperty("stagingURL");
	}
	public String getBrowser1()
	{
		return pro.getProperty("browser1");
	}
	public String getBrowser2()
	{
		return pro.getProperty("browser2");
	}
	public String getBrowser3()
	{
		return pro.getProperty("browser3");
	}

}
