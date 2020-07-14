package org.novaworld.structural.facade;

public class WorkFlow {
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Job job = new Job();

    public void solveProblems() {
        job.doJob();
        bugTracker.startActive();
        developer.doJobBeforeDeadLine(bugTracker);
    }

    public void finishJob() {
        bugTracker.finishActive();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}