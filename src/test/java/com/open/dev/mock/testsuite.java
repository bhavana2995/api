package com.open.dev.mock;

import com.google.gson.JsonObject;

import static com.jayway.restassured.RestAssured.given;

public class testsuite {


    @Test
    public void createAUser(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("password","ramareddy");
        jsonObject.addProperty("passwordConfirmation","ramareddy");
        jsonObject.addProperty("username","liju");

        given().contentType("application/json").when().body(jsonObject).post("http://localhost:8089/register").prettyPrint();
    }
}
