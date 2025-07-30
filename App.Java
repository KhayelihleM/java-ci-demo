package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println(greet("World"));
        System.out.println(greetWithPrefix("Mr Manyathi", "Welcome"));
        System.out.println("Character count: " + countCharacters("DevOps"));
    }

    // Original greet method
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // New method: greet with a custom prefix
    public static String greetWithPrefix(String name, String prefix) {
        return prefix + ", " + name + "!";
    }

    // New method: count characters in a string
    public static int countCharacters(String input) {
        return input.lengt();
    }
}