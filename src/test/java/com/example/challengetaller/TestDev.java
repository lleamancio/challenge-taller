package com.example.challengetaller;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class TestDev {

    @Test
    public void testDev() {
        User[] numbers = {new User(), new User(), new User()};
        System.out.println(numbers);
    }

    @Test
    public void testDev2() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("B");

        System.out.println(set.iterator().next());
    }

    @Test
    public void testDev3() {
        final Employee[] employees = {
                new Employee("Leticia", "contato@gmail.com", true),
                new Employee("Test", "teste@gmail.com", true),
                new Employee("Shell", "shell@gmail.com", false)
        };

        Arrays.stream(employees)
                .filter(Employee::isActive)
                .map(Employee::getEmail)
                .forEach(System.out::println);
    }

    @Test
    public void testDev4() {
        final Employee[] employees = {
                new Employee("Leticia", "contato@gmail.com", true),
                new Employee("Test", "teste@gmail.com", true),
                new Employee("Shell", "shell@gmail.com", false)
        };

        Stream<String> emailsActive = Arrays.stream(employees)
                .filter(Employee::isActive)
                .map(Employee::getEmail);

        emailsActive.forEach(System.out::println);
//        emailsActive.forEach(System.out::println);
//        emailsActive.forEach(System.out::println);
        //handle error stream has already been operated upon or closed
    }

}
