package com.solvd.githubactions;

import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void printHelloWorldTest(){
        String [] value = new String[]{"a", "b", "c"};
        HelloWorld.main(value);
    }
}
