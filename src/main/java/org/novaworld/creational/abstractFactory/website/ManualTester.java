package org.novaworld.creational.abstractFactory.website;

import org.novaworld.creational.abstractFactory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}