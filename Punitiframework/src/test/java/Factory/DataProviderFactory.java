package Factory;

public class DataProviderFactory {

	public static ExcelDataProvider getExcel()
	{
		ExcelDataProvider excel= new ExcelDataProvider();
		return excel;
		
	}
	public static ConfigProviderFactory getConfig()
	{
		ConfigProviderFactory config= new ConfigProviderFactory();
		return config;
		
	}
}
