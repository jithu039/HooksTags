package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class amazonHooks {
	
	@Before
	public void setup() {
		System.out.println("lauch amazon");
		System.out.println("lauch amazon");
	}
	@After
	public void teardown() {
		System.out.println("clo0se browser");
	}

}
