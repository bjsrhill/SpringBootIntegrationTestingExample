package com.beverlyshill.rest;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import io.restassured.response.Response;

public class Index {
	
	private String [] listOfStrings = {"Beverly S. Hill", "Professional Experience", "Other Experience", "Technical Skills", "Training", "Education"};
		
	public ArrayList<String> getIndexMenus() {
		ArrayList<String> foundIndexMenus = new ArrayList<String>();
		Response indexMenusResponse = beverlyshillREST.getIndexMenusResponse();
		String resultMenus = indexMenusResponse.asString();
		foundIndexMenus.add(resultMenus);
		return foundIndexMenus;
	}

	public ArrayList<String> getExpectedMenus() {
		String output = "\"" + StringUtils.join(listOfStrings , "\",\"") + "\"";
		ArrayList<String> expected = new ArrayList<String>();
		expected.add(output);
		return expected;
		
	}
}
