package org.mehrabi.functionalinterface;

public class Main {
    public static void main(String[] args) {
        Test t = s -> {
            System.out.println(s);
        };
        t.test("hello");
    }
}
