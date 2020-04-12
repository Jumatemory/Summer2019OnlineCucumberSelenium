package com.vytrack.step_definitions;

import io.cucumber.java.Before;

public class Hook {
    @Before
    public void setup(){
        System.out.println("Test setup!");


    }
    @Before
    public void teardown(){
        System.out.println("Cleanup!");
        System.out.println("Test completed!");


    }
}
