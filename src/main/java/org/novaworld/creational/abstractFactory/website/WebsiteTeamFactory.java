package org.novaworld.creational.abstractFactory.website;

import org.novaworld.creational.abstractFactory.Developer;
import org.novaworld.creational.abstractFactory.ProjectManager;
import org.novaworld.creational.abstractFactory.ProjectTeamFactory;
import org.novaworld.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new WebsitePM();
    }
}