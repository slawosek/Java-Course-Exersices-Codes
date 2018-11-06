package com.company;
public class Main {

    public static void main(String[] args) {

    Predicate<String> p1 = s -> s.length() < 20;
    Predicate<String> p2 = s -> s.length() > 5;

    System.out.println("Hello has less than 20 length "+p1.test("Hello"));

    Predicate<String> p3 = p1.and(p2);

    System.out.println();
    System.out.println("P3 for rest " + p3.test("rest"));
    System.out.println("P3 for More letters " + p3.test("More words"));
    System.out.println("P3 for there are too many of them " + p3.test("there are too many of them"));

    Predicate<String> p4 = p1.or(p2);

    System.out.println();
    System.out.println("P4 for rest " + p4.test("rest"));
    System.out.println("P4 for More letters " + p4.test("More words"));
    System.out.println("P4 for there are too many of them " + p4.test("there are too many of them"));

    Predicate<String> p5 = Predicate.isEqual("Yes");

    System.out.println();
    System.out.println("P5 for Yes " + p5.test("Yes"));
    System.out.println("P5 for No " + p5.test("no"));

    Predicate<Integer> p6 = Predicate.isEqual(1);
    System.out.println();
    System.out.println("P6 for 1 " + p6.test(1));
    System.out.println("P6 for 3 " + p6.test(3));
    }
}
