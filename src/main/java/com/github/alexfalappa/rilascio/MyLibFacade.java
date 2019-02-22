package com.github.alexfalappa.rilascio;

/**
 * A MyLib implementation.
 *
 * @author Alessandro Falappa
 */
public class MyLibFacade implements NewInterface {

    @Override
    public String version() {
        return "First version";
    }

    @Override
    public void doSomething(String thing) {
    }

}
