package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
@Before(order=1)
public void setUp_browser(Scenario sc) {
	System.out.println("launch chrome ");
	System.out.println(sc.getName());
}
@Before(order=2)
public void setUp_url() {
	System.out.println("launch amazon url ");
}
@After(order = 2)
public void tearDown_close() {
	System.out.println("close the browser");
}
@After(order = 1)
public void tearDown_logout() {
		System.out.println("logout");
}
@BeforeStep
public void takescreenshot() {
	System.out.println("take screenshot");
	
}
@AfterStep
public void refresh() {
	System.out.println("refresh the page ");
}

}
