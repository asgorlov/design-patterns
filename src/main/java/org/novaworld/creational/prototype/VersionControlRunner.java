package org.novaworld.creational.prototype;

public class VersionControlRunner {

    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "Source source = new Source();");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project copyMaster = factory.cloneProject();
        System.out.println(copyMaster);
    }
}