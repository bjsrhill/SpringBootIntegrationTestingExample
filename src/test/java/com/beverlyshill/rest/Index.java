package com.beverlyshill.rest;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import io.restassured.response.Response;

/**
 * Index page object class
 * 
 * @author beverlyshill
 *
 */
public class Index {
	
	private String [] listOfStrings = {"Beverly S. Hill", "Professional Experience", "Other Experience", "Technical Skills", "Training", "Education"};
	
	/**
	 * Makes a REST call to get the menus from 
	 * the Index page of the application being tested
	 * 
	 * @return an ArrayList of Strings representing 
	 * the Index page menus
	 */
	public ArrayList<String> getIndexMenus() {
		ArrayList<String> foundIndexMenus = new ArrayList<String>();
		Response indexMenusResponse = beverlyshillREST.getIndexMenusResponse();
		String resultMenus = indexMenusResponse.asString();
		foundIndexMenus.add(resultMenus);
		return foundIndexMenus;
	}

	/**
	 * Gets the expected menu items for the Index page
	 * of the application being tested
	 * 
	 * @return an ArrayList of Strings representing
	 * the expected Index page menu items
	 */
	public ArrayList<String> getExpectedMenus() {
		String output = "\"" + StringUtils.join(listOfStrings , "\",\"") + "\"";
		ArrayList<String> expected = new ArrayList<String>();
		expected.add(output);
		return expected;
		
	}
}
