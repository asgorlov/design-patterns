package org.novaworld.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is not known.");
        }
    }
}