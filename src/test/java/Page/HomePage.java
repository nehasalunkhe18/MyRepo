package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase
{
	@FindBy (xpath="//a[contains(text(), 'Qafox.com')]")
	WebElement appLogo;
	
	@FindBy (xpath="//a[text()='Laptops & Notebooks'][@class='dropdown-toggle']")
	WebElement LaptopAndNotebookSection;
	
	@FindBy (xpath="//input[@name='search']")
	WebElement SearchBox;
	
	@FindBy (xpath="//button[@class='btn btn-default btn-lg']")
	WebElement GoBtn;
	
	public void appLogo()
	{
		try 
		{
			System.out.println(appLogo.getText());
			
			if(appLogo.isDisplayed())
			{
				System.out.println("Logo Displayed");
			}
			else
			{
				System.out.println("Logo Not Displayed");
			}
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void LaptopNotebook()
	{
		try
		{
			if(LaptopAndNotebookSection.isDisplayed())
			{
				System.out.println(" Displayed");
			}
			else
			{
				System.out.println("Not Displayed");
			}
			
			LaptopAndNotebookSection.click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void searchBox()
	{
		try
		{
			if(SearchBox.isEnabled())
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("Disabled");
			}
			
			SearchBox.click();
			SearchBox.sendKeys("iphone");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void goBtn()
	{
		try
		{
			if(GoBtn.isEnabled())
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("Disabled");
			}
			
			GoBtn.click();
			GoBtn.sendKeys("iphone");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}


}
