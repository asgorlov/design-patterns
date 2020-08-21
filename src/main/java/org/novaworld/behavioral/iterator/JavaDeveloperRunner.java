package org.novaworld.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven", "Hibernate", "SQL"};

        JavaDeveloper developer = new JavaDeveloper("Anton Pi", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Developer: " + developer.getName());
        System.out.print("Skills: | ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " | ");
        }
    }
}
