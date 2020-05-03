package SimpleListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AdminPanelTest {

	@Test
	public void Login() {

	}
	
	@Test
	public void fillform() {

		Assert.fail();
	}
	
	@Test
	public void validateData() {

		throw new SkipException("Skipping the Test");
	}
	
}
