package org.novaworld.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new PhpDeveloper()),
                new BankSystem(new PhpDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
