package org.novaworld.behavioral.memento;

public class GitHubProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo repository = new GitHubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);
        System.out.println("Saving current version \n");
        repository.setSaver(project.save());
        Thread.sleep(1000);

        System.out.println("Updating project. Version 1.1");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println();

        System.out.println("Rolling project to Version 1.0");
        project.load(repository.getSaver());
        System.out.println(project);
    }
}
