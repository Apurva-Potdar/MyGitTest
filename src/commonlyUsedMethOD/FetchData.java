package commonlyUsedMethOD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FetchData {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream myfile = new FileInputStream("D:\\Apurva\\Apurva Docs\\javaStudy\\velocitySelenium\\CoverFoxData.properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty("CityName");
		System.out.println(value);
	}
}
