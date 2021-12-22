package ru.job4j;

public class StudentInfo {
    public static void main(String[] args) {
        System.out.println("Daniil Bannov");
        System.out.println("10.07.1977");
    }

    public static class ArgMethod {
        public static void hello(String name, int age) {
            System.out.println("Hello, " + name + ", age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
            ArgMethod.hello(name, age);
        }
    }
}
