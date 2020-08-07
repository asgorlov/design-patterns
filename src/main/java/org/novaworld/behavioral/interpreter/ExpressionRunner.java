package org.novaworld.behavioral.interpreter;

public class ExpressionRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEeExpression();

        System.out.println("Does developer knows Java Core : " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE : " + isJavaEE.interpret("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEeExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Java Spring");

        return new AndExpression(java, spring);
    }
}