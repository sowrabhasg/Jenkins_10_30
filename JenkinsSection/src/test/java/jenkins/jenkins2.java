package jenkins;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkins2
{
	@Test
	public void jen() 
	{
		 String browser = System.getProperty("Browser");
		 Reporter.log(browser,true);
		
	}
}
