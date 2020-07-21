package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class RunHooks {

	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println("@Before Started");
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getSourceTagNames());
		System.out.println("@Before Ended");
	}
	@After
	public void afterScenario(Scenario sc) {
		System.out.println("@After Started");
		System.out.println(sc.getStatus());
		System.out.println("@AfterEnded");
	}
}
