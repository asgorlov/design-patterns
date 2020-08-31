package org.novaworld.behavioral.visitor;

public interface Developer {
    void create (ProjectClass projectClass);

    void create (ProjectDatabase projectDatabase);

    void create (ProjectTest projectTest);
}
