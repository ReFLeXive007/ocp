package ru.reflexive.tests;

/**
 * @author Artur Gareev
 */
public class IfTest {
    public static void main(String[] args) {
        String var = System.getProperty("artur");
        System.out.println(var != null && var.equals("mmm") );
    }
}
