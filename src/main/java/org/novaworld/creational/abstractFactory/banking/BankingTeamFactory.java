package org.novaworld.creational.abstractFactory.banking;

import org.novaworld.creational.abstractFactory.Developer;
import org.novaworld.creational.abstractFactory.ProjectManager;
import org.novaworld.creational.abstractFactory.ProjectTeamFactory;
import org.novaworld.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QaTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new BankingPM();
    }
}
