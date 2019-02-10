package UnitTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.ConfigProviderFactory;
import Factory.ExcelDataProvider;

public class TestDataProviderFactory {
	
	@Test
	public void TestExcelDataProvider()
	{
		ExcelDataProvider excel= new ExcelDataProvider();
		String Data1= excel.getStringData("Login", 0, 0);
		Assert.assertEquals(Data1, "chunmun.testing@gmail.com");
		int Data2= excel.getIntegerData("Login", 1, 0);
		Assert.assertEquals(Data2, 12);
//		double Data3= excel.getdoubleData("Login", 1, 1);
//		Assert.assertEquals(Data3,345);
	}

	@Test
	public void TestConfigFile()
	{
		ConfigProviderFactory config = new ConfigProviderFactory();
		String Data1= config.getValue("testconfig");
		Assert.assertEquals(Data1, "TestingConfigFile");
		String Data2=config.getURL();
		Assert.assertEquals(Data2, "https://www.facebook.com");
	}
}
