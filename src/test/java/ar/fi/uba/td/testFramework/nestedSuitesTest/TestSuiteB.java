package ar.fi.uba.td.testFramework.nestedSuitesTest;

import ar.fi.uba.td.testFramework.TestSuite;

public class TestSuiteB extends TestSuite {

	public TestSuiteB(String name) {
		super(name);
	}
	
	public void setUp() {
		System.out.println("TestSuiteB is setting up.");
		MockClass mock = new MockClass("Using TestSuiteB context!");
		this.getContext().addElement("mockB", mock);
	}
	
	public void tearDown() {
		System.out.println("TestSuiteB is tearing down.");
	}

}
