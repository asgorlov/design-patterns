package org.novaworld.creational.abstractFactory.website;

import org.novaworld.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}