package org.novaworld.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer subscriber1 = new Subscriber("Anton Pi");
        Observer subscriber2 = new Subscriber("Sergey Po");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Third Java position");

        jobSite.removeVacancy("First Java position");
    }
}
