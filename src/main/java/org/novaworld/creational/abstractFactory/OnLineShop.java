package org.novaworld.creational.abstractFactory;

import org.novaworld.creational.abstractFactory.website.WebsiteTeamFactory;

public class OnLineShop {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManager projectManager = projectTeamFactory.createProjectManager();

        System.out.println("Creating website project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}