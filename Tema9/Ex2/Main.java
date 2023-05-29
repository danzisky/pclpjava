package Tema9.Ex2;

import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> studenti = new Vector<>();

        Student student1 = new Student("John Dowry");
        student1.addMedie(9.5);
        student1.addMedie(8.8);
        studenti.add(student1);

        Student student2 = new Student("Popescu Smith");
        student2.addMedie(9.2);
        student2.addMedie(8.9);
        studenti.add(student2);

        Student student3 = new Student("John Radulescu");
        student3.addMedie(8.7);
        student3.addMedie(8.9);
        studenti.add(student3);

        Collections.sort(studenti);

        for (Student student : studenti) {
            System.out.println(student);
        }
    }
}