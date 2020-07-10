package org.novaworld.creational.abstractFactory;

import org.novaworld.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer1 = projectTeamFactory.createDeveloper();
        Developer developer2 = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        ProjectManager projectManager = projectTeamFactory.createProjectManager();

        System.out.println("Creating bank system...");
        developer1.writeCode();
        developer2.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}