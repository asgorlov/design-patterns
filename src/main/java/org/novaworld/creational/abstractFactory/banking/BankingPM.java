package org.novaworld.creational.abstractFactory.banking;

import org.novaworld.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}