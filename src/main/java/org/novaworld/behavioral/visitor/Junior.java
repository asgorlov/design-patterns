package org.novaworld.behavioral.visitor;

public class Junior implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(ProjectDatabase projectDatabase) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(ProjectTest projectTest) {
        System.out.println("Creating not reliable tests...");
    }
}
