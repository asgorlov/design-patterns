package org.novaworld.creational.factory;

public class PythonDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}