package org.novaworld.creational.abstractFactory.website;

import org.novaworld.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}