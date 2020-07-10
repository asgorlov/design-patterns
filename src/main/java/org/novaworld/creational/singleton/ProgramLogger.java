package org.novaworld.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is logFile. \n\n";

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogInfo(){
        System.out.println(logFile);
    }
}