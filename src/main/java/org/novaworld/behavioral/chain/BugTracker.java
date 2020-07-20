package org.novaworld.behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SmsNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Something is OK", Priority.ROUTINE);
        reportNotifier.notifyManager("Something is wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("We have a problem", Priority.ASAP);
    }
}