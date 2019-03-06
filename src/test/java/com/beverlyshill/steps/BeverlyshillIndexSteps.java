package com.beverlyshill.steps;

import static org.junit.Assert.assertTrue;

import com.beverlyshill.rest.Index;
import com.beverlyshill.rest.beverlyshillREST;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BeverlyshillIndexSteps {
	
	private String webIndexMenus = "";
	private String expectedMenus = "";
	private Index index = new Index();
	
	@Given("^the page displays$")
	public void the_page_displays() throws Exception {
		beverlyshillREST.getIndexMenus();
	}

	@Then("^menu items are found$")
	public void menu_itmes_are_found() throws Exception {
		webIndexMenus = index.getIndexMenus().get(0).toString();
		expectedMenus = index.getExpectedMenus().toString();
		assertTrue("The index page does not have the correct menus.", webIndexMenus.equals(expectedMenus));
	}
}
