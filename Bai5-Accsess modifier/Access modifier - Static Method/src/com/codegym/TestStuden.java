package com.codegym;
public class TestStuden {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "PHUC");
        Student s2 = new Student(112, "HUONG");
        Student s3 = new Student(113, "LOI");

        s1.display();
        s2.display();
        s3.display();
    }
}
