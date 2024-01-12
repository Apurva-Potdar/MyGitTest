package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class FBDataProvider {
	@DataProvider(name = "FBRegression")
	public static String[][] fbDataSet()
	{
	String data[][]=

	{{"Apurva","Potdar","8421526902"},{"Maddy","Ramule","8830727506"},{"Veera","Ramule","8668900137"}};

	return data;
	}

	@DataProvider(name = "FBSanity")
	public static String[][] fbDataSet1()
	{
	String data[][]=

	{{"ABC","XYZ","9421357890"},{"PQR","LMN","999997890"},{"CBZ","WER","9488888990"}};

	return data;
	}
}
