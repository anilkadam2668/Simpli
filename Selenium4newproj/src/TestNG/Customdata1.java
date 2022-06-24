package TestNG;

import org.testng.annotations.DataProvider;

public class Customdata1 
{@DataProvider(name="Testdata1")
public Object[][] dataset()
{
	Object dset[][]= {{"admin","admin123"},{"tester1","tester123"},{"tes2ter2","tester123"}};
	return dset;
}

}
