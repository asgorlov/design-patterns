package org.novaworld.structural.facade;

public class SprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();

        workFlow.solveProblems();
        workFlow.finishJob();
    }
}