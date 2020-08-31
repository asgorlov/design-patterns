package org.novaworld.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new Junior();
        Developer senior = new Senior();

        System.out.println("Junior action...");
        project.beWritten(junior);
        System.out.println("=====================================");

        System.out.println("Senior action...");
        project.beWritten(senior);
    }
}
