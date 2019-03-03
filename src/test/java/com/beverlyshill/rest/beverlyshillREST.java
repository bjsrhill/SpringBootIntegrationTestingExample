package com.beverlyshill.rest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class beverlyshillREST {
	
	private static Response getIndexMenusResponse;
	private static ArrayList<List> indexMenus;

	public static void getIndexMenus() {
		RestAssured.baseURI = "http://beverlyshill.solutions/";
		RestAssured.basePath = "index";
		RestAssured.defaultParser = Parser.JSON;
		String getLine = RestAssured.baseURI + RestAssured.basePath;
		getIndexMenusResponse =
        		given().
                when().
                get(getLine).
                then().
                statusCode(200).
                extract().response();
	}
	
	public static Response getIndexMenusResponse() {
		return getIndexMenusResponse;
	}
	

}
