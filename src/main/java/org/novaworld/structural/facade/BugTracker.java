package org.novaworld.structural.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startActive() {
        System.out.println("Sprint is active...");
        activeSprint = true;
    }

    public void finishActive() {
        System.out.println("Sprint is not active...");
        activeSprint = false;
    }
}