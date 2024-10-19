package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.TestBase;

public class HomePageTest extends TestBase
{
	 HomePage HomePageTC;

		@Test
		public void initElement()
		{
			HomePageTC = PageFactory.initElements(driver, HomePage.class);
		}
		
		@Test(dependsOnMethods ="initElement")
		public void CheckAppLogo()
		{
			HomePageTC.appLogo();
		}
		
		@Test(dependsOnMethods ="CheckAppLogo")
		public void CheckLaptopAndNoteBook()
		{
			HomePageTC.LaptopNotebook();
		}
		
		@Test(dependsOnMethods ="CheckLaptopAndNoteBook")
		public void CheckSearchBox()
		{
			HomePageTC.searchBox();
		}
		
		@Test(dependsOnMethods ="CheckSearchBox")
		public void CheckGoBtn()
		{
			HomePageTC.goBtn();
		}

}
