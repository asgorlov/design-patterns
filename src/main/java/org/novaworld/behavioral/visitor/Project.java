package org.novaworld.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] elements;

    public Project() {
        this.elements = new ProjectElement[] {
                new ProjectClass(),
                new ProjectDatabase(),
                new ProjectTest()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element: elements) {
            element.beWritten(developer);
        }
    }
}
