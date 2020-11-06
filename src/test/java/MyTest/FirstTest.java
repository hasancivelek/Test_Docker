package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
	
	
	@Test
	public void facebookTest() {
		
		getDriver().navigate().to("https://www.facebook.com");
		
		Assert.assertEquals(getDriver().getTitle(), "Facebook - Log In or Sign Up");
	}
	
	@Test
public void gmailTest () {
		
		getDriver().navigate().to("https://www.gmail.com");
		
		Assert.assertEquals(getDriver().getTitle(), "Gmail");
	}
	
	@Test
	public void instagramTest () {
			
			getDriver().navigate().to("https://www.instagram.com");
			
			Assert.assertEquals(getDriver().getTitle(), "Instagram");
		}
	
	

}
