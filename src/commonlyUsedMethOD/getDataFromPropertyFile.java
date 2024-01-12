package commonlyUsedMethOD;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFile {

	public static String readDataFromPropertyFile(String key) throws IOException
	{
	Properties prop= new Properties();
	
	FileInputStream myFile= new FileInputStream("D:\\Yogendra\\Tesing29_JulyEven_Selenium\\CoverFoxData.properties");

	prop.load(myFile);

	String value = prop.getProperty(key);
	return value;
	}	
}
