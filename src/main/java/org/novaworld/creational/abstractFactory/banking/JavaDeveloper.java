package org.novaworld.creational.abstractFactory.banking;

import org.novaworld.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}