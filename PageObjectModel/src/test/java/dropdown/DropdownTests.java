package dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pages.DropdownPage;

import base.BaseTest;

public class DropdownTests extends BaseTest {
	
	@Test
	public void testSelectDropdown() {
		DropdownPage dropdownpage =	homepage.clickDropdownLink();	
		
		dropdownpage.selectFromDropdown("Option 2");
		
		String selectedOption = dropdownpage.getSelectedOption();
		
		Assert.assertEquals(selectedOption, "Option 2", "Incorrect selection");
	}
}