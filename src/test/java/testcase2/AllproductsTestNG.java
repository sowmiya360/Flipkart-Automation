package testcase2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllproductsTestNG {

	@BeforeTest
	
	public void m1()
	{
		Allproducts.setup();
	}
	
	@BeforeMethod
	public void m2()
	{
		Allproducts.url();
	}
	
    @Test
    public void m3()
    {
    	Allproducts.searchengine();
    	
    }
    @Test
    public void m4()
    {
    	Allproducts.list();
    }
    
    @AfterTest
    public void m5()
    {
    	Allproducts.quit();
    }


}
