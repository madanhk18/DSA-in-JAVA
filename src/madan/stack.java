package madan;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> family = new Stack<>();

        family.add("Madan");
        family.add("Manoj");
        family.add("Sudha");
        family.add("Krishnamurthy");
        family.add("Bruno");
        System.out.println("Family :"+family);
        System.out.println(family.peek());

    }
}
