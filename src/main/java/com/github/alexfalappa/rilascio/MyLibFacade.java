package com.github.alexfalappa.rilascio;

/**
 * A MyLib implementation.
 *
 * @author Alessandro Falappa
 */
public class MyLibFacade implements Facade {

    @Override
    public String version() {
        return "First version";
    }

    @Override
    public void doSomething(String thing) {
        System.out.format("Doing something %s%n", thing);
    }

    @Override
    public void doAnotherThing(int times) {
        System.out.format("Doing another thing %d times%n", times);
    }

}
